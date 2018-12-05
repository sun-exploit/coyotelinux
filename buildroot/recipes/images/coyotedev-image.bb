# Image for kernel debugging and development testing
# It includes all useful "kernel userspace" utilities, but
# only shell and dropbear are loaded by default.
# Allows to login via serial and real console or SSH

DEPENDS = "task-coyote-devimage"
IMAGE_INSTALL = "task-coyote-devimage"

export IMAGE_BASENAME = "coyote-devimage"
IMAGE_LINGUAS = ""

PR = "r1"

inherit image
