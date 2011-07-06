/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * Describes the properties of a Listener for the LoadBalancer.
 * </p>
 */
public class Listener {

    /**
     * The protocol that is used by the Listener.
     */
    private String protocol;

    /**
     * The port that is used by the Listener.
     */
    private Integer port;

    /**
     * The protocol that is used by the Listener.
     *
     * @return The protocol that is used by the Listener.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * The protocol that is used by the Listener.
     *
     * @param protocol The protocol that is used by the Listener.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * The protocol that is used by the Listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The protocol that is used by the Listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    
    /**
     * The port that is used by the Listener.
     *
     * @return The port that is used by the Listener.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port that is used by the Listener.
     *
     * @param port The port that is used by the Listener.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port that is used by the Listener.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port that is used by the Listener.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withPort(Integer port) {
        this.port = port;
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
        sb.append("Protocol: " + protocol + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    