# meta-rpi-gpu

## Overview

`meta-rpi-gpu` is a Yocto meta-layer focused on leveraging the GPU capabilities of Raspberry Pi devices to render graphics and run OpenGL applications. This layer includes recipes and configurations necessary to build graphical applications using the GPU on Raspberry Pi.

## Layer Dependencies

This layer depends on the following layers:

- `meta`
- `meta-poky`
- `meta-yocto-bsp`
- `meta-openembedded/meta-oe`
- `meta-openembedded/meta-networking`
- `meta-openembedded/meta-python`
- `meta-raspberrypi`

Ensure these layers are included in your `bblayers.conf` file.

## Recipes

The layer includes the following recipes:

### hello-triangle

A simple OpenGL ES example application.

- **Description**: A basic example that demonstrates how to render a triangle using OpenGL ES.
- **Source**: [hello-triangle GitHub Repository](https://github.com/Vinay046/hello-triangle)
- **License**: MIT

### cube-renderer

A simple OpenGL ES example application.

- **Description**: A basic example that demonstrates how to render a cube using OpenGL ES.
- **Source**: [cube-renderer GitHub Repository](https://github.com/Vinay046/cube-renderer)
- **License**: MIT

## Setup Instructions

You will need repo tool to pull down all necessary repositories.

      repo init -u https://github.com/Vinay046/raspi-config.git -m manifest.xml -b master
