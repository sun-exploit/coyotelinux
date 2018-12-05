# Coyote Linux root filesystem (firmware) image

PR = "r1"

DEPENDS = "\
	task-distro-coyote-base \
	task-machine-coyote-base \
	task-coyote-base \
	"

IMAGE_INSTALL_TASKS = "\
	task-coyote-base \
	task-coyote-base-extended \
	"

IMAGE_INSTALL = "\
	${IMAGE_INSTALL_TASKS} \
	"

IMAGE_FSTYPES = "squashfs"

export IMAGE_BASENAME = "coyote-firmware-image"
IMAGE_LINGUAS = ""

inherit image
