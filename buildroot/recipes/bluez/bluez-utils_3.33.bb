require bluez-utils3.inc

PR = "r3"

# see bluez-utils3.inc for the explanation of these option
EXTRA_OECONF = " \
                 --enable-bccmd \
		 --enable-hid2hci \
                 --enable-hidd \
                 --enable-pand \
                 --enable-dund \
		 --disable-alsa \ 
		 --disable-cups \
		 --enable-glib \
		 --disable-sdpd \
	         --enable-network \
	         --enable-serial \
	         --enable-input \
	         --enable-audio \
	         --enable-echo \
                 --enable-configfile \
	         --enable-initscripts \
		--enable-test \
		--enable-hidd \
		--enable-obex \
		--enable-pand \
		--enable-dund \
		--enable-avctrl \
		--enable-hid2hci \
		--enable-dfutool \
		" 

CONFFILES_${PN} = " \
                   ${sysconfdir}/bluetooth/hcid.conf \
                   ${sysconfdir}/default/bluetooth \
                  "

CONFFILES_${PN}-compat = " \
                          ${sysconfdir}/bluetooth/rfcomm.conf \
                         "

PACKAGES =+ "bluez-audio"

FILES_${PN} = " \
               ${base_sbindir}/hcid \
               ${libdir}/bluetooth/plugins/*.so \
               ${sysconfdir}/init.d/bluetooth \
               ${sysconfdir}/bluetooth/hcid.conf \
               ${sysconfdir}/default \
               ${sysconfdir}/dbus-1 \
               ${base_sbindir}/hciattach \
              "

FILES_bluez-audio = " \
                     ${libdir}/bluetooth/plugins/libaudio.so \
                     ${libdir}/gstreamer-0.10/*.so \
                    "

FILES_${PN}-dbg += " \
                    ${libdir}/bluetooth/plugins/.debug \
                    ${libdir}/gstreamer-0.10/.debug \
                   "

FILES_${PN}-dev += " \
                    ${libdir}/bluetooth/plugins/*.la \
                    ${libdir}/gstreamer-0.10/*.la \
                   "
