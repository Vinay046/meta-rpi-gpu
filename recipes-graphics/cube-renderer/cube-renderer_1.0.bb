DESCRIPTION = "Cube Rendering OpenGL Example"
HOMEPAGE = "https://github.com/Vinay046/cube-renderer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=300dc5c2b87ecbb95453580885cbbf73"

SRC_URI = "git://github.com/Vinay046/cube-renderer.git;branch=master;protocol=https"
SRCREV = "${AUTOREV}"

DEPENDS = "mesa virtual/mesa virtual/egl virtual/libgles2 libdrm libgbm glm"

S = "${WORKDIR}/git"

inherit meson pkgconfig

do_configure[prepend] = "export PKG_CONFIG_PATH=${STAGING_LIBDIR}/pkgconfig:${STAGING_DIR_HOST}/usr/lib/pkgconfig:${STAGING_DIR_TARGET}/usr/lib/pkgconfig:${PKG_CONFIG_PATH}; "

do_install() {
    install -d ${D}${bindir}
    install -m 0755 cube-renderer ${D}${bindir}/cube-renderer
}

FILES_${PN} += "${bindir}/cube-renderer"
