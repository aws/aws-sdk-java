/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * 
 * </p>
 */
public class Endpoint {

    /**
     * Specifies the DNS address of the DB Instance.
     */
    private String address;

    /**
     * Specifies the port that the database engine is listening on.
     */
    private Integer port;

    /**
     * Specifies the DNS address of the DB Instance.
     *
     * @return Specifies the DNS address of the DB Instance.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Specifies the DNS address of the DB Instance.
     *
     * @param address Specifies the DNS address of the DB Instance.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Specifies the DNS address of the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param address Specifies the DNS address of the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Endpoint withAddress(String address) {
        this.address = address;
        return this;
    }
    
    
    /**
     * Specifies the port that the database engine is listening on.
     *
     * @return Specifies the port that the database engine is listening on.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the port that the database engine is listening on.
     *
     * @param port Specifies the port that the database engine is listening on.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the port that the database engine is listening on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the port that the database engine is listening on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Endpoint withPort(Integer port) {
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
        sb.append("Address: " + address + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    