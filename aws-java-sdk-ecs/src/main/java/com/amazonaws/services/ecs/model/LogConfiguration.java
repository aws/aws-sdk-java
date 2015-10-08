/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Log configuration options to send to a custom log driver for the
 * container.
 * </p>
 */
public class LogConfiguration implements Serializable, Cloneable {

    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     */
    private String logDriver;

    /**
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log into your container instance and run the
     * following command: <code>sudo docker version | grep "Server API
     * version"</code>
     */
    private java.util.Map<String,String> options;

    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     *
     * @return The log driver to use for the container. This parameter requires
     *         version 1.18 of the Docker Remote API or greater on your container
     *         instance. To check the Docker Remote API version on your container
     *         instance, log into your container instance and run the following
     *         command: <code>sudo docker version | grep "Server API version"</code>
     *
     * @see LogDriver
     */
    public String getLogDriver() {
        return logDriver;
    }
    
    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     *
     * @param logDriver The log driver to use for the container. This parameter requires
     *         version 1.18 of the Docker Remote API or greater on your container
     *         instance. To check the Docker Remote API version on your container
     *         instance, log into your container instance and run the following
     *         command: <code>sudo docker version | grep "Server API version"</code>
     *
     * @see LogDriver
     */
    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }
    
    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     *
     * @param logDriver The log driver to use for the container. This parameter requires
     *         version 1.18 of the Docker Remote API or greater on your container
     *         instance. To check the Docker Remote API version on your container
     *         instance, log into your container instance and run the following
     *         command: <code>sudo docker version | grep "Server API version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogDriver
     */
    public LogConfiguration withLogDriver(String logDriver) {
        this.logDriver = logDriver;
        return this;
    }

    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     *
     * @param logDriver The log driver to use for the container. This parameter requires
     *         version 1.18 of the Docker Remote API or greater on your container
     *         instance. To check the Docker Remote API version on your container
     *         instance, log into your container instance and run the following
     *         command: <code>sudo docker version | grep "Server API version"</code>
     *
     * @see LogDriver
     */
    public void setLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
    }
    
    /**
     * The log driver to use for the container. This parameter requires
     * version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container
     * instance, log into your container instance and run the following
     * command: <code>sudo docker version | grep "Server API version"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json-file, syslog, journald, gelf, fluentd
     *
     * @param logDriver The log driver to use for the container. This parameter requires
     *         version 1.18 of the Docker Remote API or greater on your container
     *         instance. To check the Docker Remote API version on your container
     *         instance, log into your container instance and run the following
     *         command: <code>sudo docker version | grep "Server API version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LogDriver
     */
    public LogConfiguration withLogDriver(LogDriver logDriver) {
        this.logDriver = logDriver.toString();
        return this;
    }

    /**
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log into your container instance and run the
     * following command: <code>sudo docker version | grep "Server API
     * version"</code>
     *
     * @return The configuration options to send to the log driver. This parameter
     *         requires version 1.19 of the Docker Remote API or greater on your
     *         container instance. To check the Docker Remote API version on your
     *         container instance, log into your container instance and run the
     *         following command: <code>sudo docker version | grep "Server API
     *         version"</code>
     */
    public java.util.Map<String,String> getOptions() {
        
        if (options == null) {
            options = new java.util.HashMap<String,String>();
        }
        return options;
    }
    
    /**
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log into your container instance and run the
     * following command: <code>sudo docker version | grep "Server API
     * version"</code>
     *
     * @param options The configuration options to send to the log driver. This parameter
     *         requires version 1.19 of the Docker Remote API or greater on your
     *         container instance. To check the Docker Remote API version on your
     *         container instance, log into your container instance and run the
     *         following command: <code>sudo docker version | grep "Server API
     *         version"</code>
     */
    public void setOptions(java.util.Map<String,String> options) {
        this.options = options;
    }
    
    /**
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log into your container instance and run the
     * following command: <code>sudo docker version | grep "Server API
     * version"</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The configuration options to send to the log driver. This parameter
     *         requires version 1.19 of the Docker Remote API or greater on your
     *         container instance. To check the Docker Remote API version on your
     *         container instance, log into your container instance and run the
     *         following command: <code>sudo docker version | grep "Server API
     *         version"</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LogConfiguration withOptions(java.util.Map<String,String> options) {
        setOptions(options);
        return this;
    }

    /**
     * The configuration options to send to the log driver. This parameter
     * requires version 1.19 of the Docker Remote API or greater on your
     * container instance. To check the Docker Remote API version on your
     * container instance, log into your container instance and run the
     * following command: <code>sudo docker version | grep "Server API
     * version"</code>
     * <p>
     * The method adds a new key-value pair into Options parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Options.
     * @param value The corresponding value of the entry to be added into Options.
     */
  public LogConfiguration addOptionsEntry(String key, String value) {
    if (null == this.options) {
      this.options = new java.util.HashMap<String,String>();
    }
    if (this.options.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.options.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Options.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public LogConfiguration clearOptionsEntries() {
    this.options = null;
    return this;
  }
  
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogDriver() != null) sb.append("LogDriver: " + getLogDriver() + ",");
        if (getOptions() != null) sb.append("Options: " + getOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode()); 
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LogConfiguration == false) return false;
        LogConfiguration other = (LogConfiguration)obj;
        
        if (other.getLogDriver() == null ^ this.getLogDriver() == null) return false;
        if (other.getLogDriver() != null && other.getLogDriver().equals(this.getLogDriver()) == false) return false; 
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        return true;
    }
    
    @Override
    public LogConfiguration clone() {
        try {
            return (LogConfiguration) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    