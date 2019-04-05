/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetSupportedResourceTypes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSupportedResourceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a string with the supported AWS resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * Contains a string with the supported AWS resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @return Contains a string with the supported AWS resource types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EBS</code> for Amazon Elastic Block Store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SGW</code> for AWS Storage Gateway
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDS</code> for Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DDB</code> for Amazon DynamoDB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EFS</code> for Amazon Elastic File System
     *         </p>
     *         </li>
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * Contains a string with the supported AWS resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTypes
     *        Contains a string with the supported AWS resource types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SGW</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * Contains a string with the supported AWS resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        Contains a string with the supported AWS resource types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SGW</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSupportedResourceTypesResult withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a string with the supported AWS resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SGW</code> for AWS Storage Gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceTypes
     *        Contains a string with the supported AWS resource types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SGW</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSupportedResourceTypesResult withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSupportedResourceTypesResult == false)
            return false;
        GetSupportedResourceTypesResult other = (GetSupportedResourceTypesResult) obj;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetSupportedResourceTypesResult clone() {
        try {
            return (GetSupportedResourceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
