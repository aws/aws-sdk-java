/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Contains general information about a domain.
 * </p>
 */
public class DomainInfo implements Serializable {

    /**
     * The name of the domain. This name is unique within the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     */
    private String status;

    /**
     * The description of the domain provided through <a>RegisterDomain</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * The name of the domain. This name is unique within the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain. This name is unique within the account.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the domain. This name is unique within the account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the domain. This name is unique within the account.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the domain. This name is unique within the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the domain. This name is unique within the account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @return The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     *         properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions. </li> <li>
     *         <b>DEPRECATED</b>: The domain was deprecated using
     *         <a>DeprecateDomain</a>, but is still in use. You should not create new
     *         workflow executions in this domain. </li> </ul>
     *
     * @see RegistrationStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     *         properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions. </li> <li>
     *         <b>DEPRECATED</b>: The domain was deprecated using
     *         <a>DeprecateDomain</a>, but is still in use. You should not create new
     *         workflow executions in this domain. </li> </ul>
     *
     * @see RegistrationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     *         properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions. </li> <li>
     *         <b>DEPRECATED</b>: The domain was deprecated using
     *         <a>DeprecateDomain</a>, but is still in use. You should not create new
     *         workflow executions in this domain. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public DomainInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     *         properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions. </li> <li>
     *         <b>DEPRECATED</b>: The domain was deprecated using
     *         <a>DeprecateDomain</a>, but is still in use. You should not create new
     *         workflow executions in this domain. </li> </ul>
     *
     * @see RegistrationStatus
     */
    public void setStatus(RegistrationStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     * properly registered and available. You can use this domain for
     * registering types and creating new workflow executions. </li> <li>
     * <b>DEPRECATED</b>: The domain was deprecated using
     * <a>DeprecateDomain</a>, but is still in use. You should not create new
     * workflow executions in this domain. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The status of the domain: <ul> <li> <b>REGISTERED</b>: The domain is
     *         properly registered and available. You can use this domain for
     *         registering types and creating new workflow executions. </li> <li>
     *         <b>DEPRECATED</b>: The domain was deprecated using
     *         <a>DeprecateDomain</a>, but is still in use. You should not create new
     *         workflow executions in this domain. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public DomainInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The description of the domain provided through <a>RegisterDomain</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The description of the domain provided through <a>RegisterDomain</a>.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the domain provided through <a>RegisterDomain</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the domain provided through <a>RegisterDomain</a>.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the domain provided through <a>RegisterDomain</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the domain provided through <a>RegisterDomain</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainInfo withDescription(String description) {
        this.description = description;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DomainInfo == false) return false;
        DomainInfo other = (DomainInfo)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    