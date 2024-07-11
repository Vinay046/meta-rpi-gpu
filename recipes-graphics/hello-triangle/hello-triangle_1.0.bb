DESCRIPTION = "Hello Triangle OpenGL Example"
HOMEPAGE = "https://github.com/Vinay046/hello-triangle"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=300dc5c2b87ecbb95453580885cbbf73"

SRC_URI = "git://github.com/Vinay046/hello-triangle.git;branch=master;protocol=https"
SRCREV = "129cb1d6a90321702bb775d6a2ac9958bcb27f80"

DEPENDS = "mesa virtual/mesa virtual/egl virtual/libgles2 wayland wayland-protocols wayland-native"

S = "${WORKDIR}/git"

inherit meson pkgconfig

do_configure[prepend] = "export PKG_CONFIG_PATH=${STAGING_LIBDIR}/pkgconfig:${STAGING_DIR_HOST}/usr/lib/pkgconfig:${STAGING_DIR_TARGET}/usr/lib/pkgconfig:${PKG_CONFIG_PATH}; "

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-triangle ${D}${bindir}/hello-triangle
}

FILES_${PN} += "${bindir}/hello-triangle"
