/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util.jmx;

import java.lang.management.ManagementFactory;
import java.util.List;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import org.apache.commons.logging.LogFactory;

/**
 * MBean related utilities.
 */
public enum MBeans {
    ;
    /**
     * Registers the given MBean under the given object name to the first
     * registered MBean server, or the platform MBean server if there is no
     * explicitly registered MBean server.
     * 
     * @return true if the registration succeeded, or false if an MBean already
     *         exists under the given object name.
     * @throws MBeanRegistrationException
     *             The preRegister (MBeanRegistration interface) method of the
     *             MBean has thrown an exception. The MBean will not be
     *             registered.
     */
    public static <T> boolean registerMBean(String objectName, T mbean)
            throws MBeanRegistrationException {
        MBeanServer server = getMBeanServer();
        try {
            server.registerMBean(mbean, new ObjectName(objectName));
        } catch (MalformedObjectNameException e) {
            throw new IllegalArgumentException(e);
        } catch (NotCompliantMBeanException e) {
            throw new IllegalArgumentException(e);
        } catch (InstanceAlreadyExistsException e) {
            LogFactory.getLog(MBeans.class).debug(
                "Failed to register mbean " + objectName, e);
            return false;
        }
        return true;
    }
    
    /**
     * Returns the first registered MBean server, or the platform MBean server
     * if there is none.
     */
    public static MBeanServer getMBeanServer() {
        List<MBeanServer> servers = MBeanServerFactory.findMBeanServer(null);
        MBeanServer server = servers.size() > 0
            ? servers.get(0)
            : ManagementFactory.getPlatformMBeanServer();
        return server;
    }
}
