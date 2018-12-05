require linux.inc

DESCRIPTION = "Linux kernel for Davinci processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "davinci-sffsdr"

SRCREV = "0fc192ac07c977ad6f14333651b53096a6027bc6"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/khilman/linux-davinci.git;protocol=git \
           file://defconfig"

SRC_URI_append_davinci-sffsdr = " \
           file://0001-USB-musb-cppi-bugfixes.patch;patch=1 \
           file://0002-ARM-Mark-unsupported-syscalls-as-IGNORE.patch;patch=1 \
           file://0003-Add-macros-for-enabling-a-UART.patch;patch=1 \
           file://0004-Davinci-Enable-MAC-address-to-be-specified-on-kerne.patch;patch=1 \
           file://0005-Add-DAS-Mini-DAS-and-AFE-USB-machine-types.patch;patch=1 \
           file://0006-ALSA-ASoC-DaVinci-Fix-SFFSDR-compilation-error.patch;patch=1 \
           file://0007-ALSA-ASoC-Davinci-Fix-SFFSDR-FPGA-module-codec-FS.patch;patch=1 \
           file://0008-ALSA-ASoC-Davinci-Fix-incorrect-machine-type-for.patch;patch=1 \
           file://0009-sound-ASoC-Fix-DaVinci-module-unload-error.patch;patch=1 \
           file://0010-Add-generic-FPGA-bitstream-loader-driver.patch;patch=1 \
           file://0011-Add-lyrvpss-example-driver-for-the-SFFSDR-board.patch;patch=1 \
           file://0012-Update-SFFSDR-to-support-FPGA-and-lyrvpss-drivers.patch;patch=1 \
          "

S = "${WORKDIR}/git"
