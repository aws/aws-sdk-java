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
 * Indicates if the specified CNAME is available.
 * </p>
 */
public class CheckDNSAvailabilityResult {

    /**
     * Indicates if the specified CNAME is available: <enumValues> <value
     * name="true"> <p> <code>true</code> : The CNAME is available. </value>
     * <value name="false"> <p> <code>true</code> : The CNAME is not
     * available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     * The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     * not available. </li> </ul>
     */
    private Boolean available;

    /**
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String fullyQualifiedCNAME;

    /**
     * Indicates if the specified CNAME is available: <enumValues> <value
     * name="true"> <p> <code>true</code> : The CNAME is available. </value>
     * <value name="false"> <p> <code>true</code> : The CNAME is not
     * available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     * The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     * not available. </li> </ul>
     *
     * @return Indicates if the specified CNAME is available: <enumValues> <value
     *         name="true"> <p> <code>true</code> : The CNAME is available. </value>
     *         <value name="false"> <p> <code>true</code> : The CNAME is not
     *         available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     *         The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     *         not available. </li> </ul>
     */
    public Boolean isAvailable() {
        return available;
    }
    
    /**
     * Indicates if the specified CNAME is available: <enumValues> <value
     * name="true"> <p> <code>true</code> : The CNAME is available. </value>
     * <value name="false"> <p> <code>true</code> : The CNAME is not
     * available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     * The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     * not available. </li> </ul>
     *
     * @param available Indicates if the specified CNAME is available: <enumValues> <value
     *         name="true"> <p> <code>true</code> : The CNAME is available. </value>
     *         <value name="false"> <p> <code>true</code> : The CNAME is not
     *         available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     *         The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     *         not available. </li> </ul>
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
    
    /**
     * Indicates if the specified CNAME is available: <enumValues> <value
     * name="true"> <p> <code>true</code> : The CNAME is available. </value>
     * <value name="false"> <p> <code>true</code> : The CNAME is not
     * available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     * The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     * not available. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param available Indicates if the specified CNAME is available: <enumValues> <value
     *         name="true"> <p> <code>true</code> : The CNAME is available. </value>
     *         <value name="false"> <p> <code>true</code> : The CNAME is not
     *         available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     *         The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     *         not available. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CheckDNSAvailabilityResult withAvailable(Boolean available) {
        this.available = available;
        return this;
    }
    
    
    /**
     * Indicates if the specified CNAME is available: <enumValues> <value
     * name="true"> <p> <code>true</code> : The CNAME is available. </value>
     * <value name="false"> <p> <code>true</code> : The CNAME is not
     * available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     * The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     * not available. </li> </ul>
     *
     * @return Indicates if the specified CNAME is available: <enumValues> <value
     *         name="true"> <p> <code>true</code> : The CNAME is available. </value>
     *         <value name="false"> <p> <code>true</code> : The CNAME is not
     *         available. </value> </enumValues> <p> <ul> <li> <code>true</code> :
     *         The CNAME is available. </li> <li> <code>false</code> : The CNAME is
     *         not available. </li> </ul>
     */
    public Boolean getAvailable() {
        return available;
    }
    
    /**
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     *         called with the provided prefix.
     */
    public String getFullyQualifiedCNAME() {
        return fullyQualifiedCNAME;
    }
    
    /**
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param fullyQualifiedCNAME The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     *         called with the provided prefix.
     */
    public void setFullyQualifiedCNAME(String fullyQualifiedCNAME) {
        this.fullyQualifiedCNAME = fullyQualifiedCNAME;
    }
    
    /**
     * The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     * called with the provided prefix.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param fullyQualifiedCNAME The fully qualified CNAME to reserve when <a>CreateEnvironment</a> is
     *         called with the provided prefix.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CheckDNSAvailabilityResult withFullyQualifiedCNAME(String fullyQualifiedCNAME) {
        this.fullyQualifiedCNAME = fullyQualifiedCNAME;
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
        sb.append("Available: " + available + ", ");
        sb.append("FullyQualifiedCNAME: " + fullyQualifiedCNAME + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    