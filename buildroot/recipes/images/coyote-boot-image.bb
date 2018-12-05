# Coyote Boot Image - This image is used for the firmware
# loader

PR = "r147"

DEPENDS = "\
	task-boot \
	task-distro-coyote-base \
	task-machine-coyote-base \
	task-coyote-base \
	grub \
	"

IMAGE_INSTALL_TASKS = "\
	task-coyote-base \
	grub \
	nano \
	"

IMAGE_INSTALL = "\
	task-boot \
	${IMAGE_INSTALL_TASKS} \
	"

IMAGE_FSTYPES = "tar.gz"

export IMAGE_BASENAME = "coyote-boot-image"
IMAGE_LINGUAS = ""

inherit image
