package org.telestax.slee.container.build.as7.service;

import org.jboss.msc.service.ServiceName;

public class SleeServiceNames {

	/** The base name for SLEE services. */
    public static final ServiceName BASE = ServiceName.of("telestax","slee");
    public static final ServiceName SLEE_CONTAINER = BASE.append("container");
    
}
