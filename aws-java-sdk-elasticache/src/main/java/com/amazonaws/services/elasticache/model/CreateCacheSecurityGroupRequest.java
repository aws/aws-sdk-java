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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateCacheSecurityGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCacheSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the cache security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     * </p>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     */
    private String cacheSecurityGroupName;
    /**
     * <p>
     * A description for the cache security group.
     * </p>
     */
    private String description;

    /**
     * Default constructor for CreateCacheSecurityGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateCacheSecurityGroupRequest() {
    }

    /**
     * Constructs a new CreateCacheSecurityGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cacheSecurityGroupName
     *        A name for the cache security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     *        </p>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     * @param description
     *        A description for the cache security group.
     */
    public CreateCacheSecurityGroupRequest(String cacheSecurityGroupName, String description) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        setDescription(description);
    }

    /**
     * <p>
     * A name for the cache security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     * </p>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        A name for the cache security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     *        </p>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     */

    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * A name for the cache security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     * </p>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @return A name for the cache security group. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     *         </p>
     *         <p>
     *         Example: <code>mysecuritygroup</code>
     */

    public String getCacheSecurityGroupName() {
        return this.cacheSecurityGroupName;
    }

    /**
     * <p>
     * A name for the cache security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     * </p>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        A name for the cache security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default".
     *        </p>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSecurityGroupRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the cache security group.
     * </p>
     * 
     * @param description
     *        A description for the cache security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the cache security group.
     * </p>
     * 
     * @return A description for the cache security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the cache security group.
     * </p>
     * 
     * @param description
     *        A description for the cache security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSecurityGroupRequest withDescription(String description) {
        setDescription(description);
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
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: ").append(getCacheSecurityGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCacheSecurityGroupRequest == false)
            return false;
        CreateCacheSecurityGroupRequest other = (CreateCacheSecurityGroupRequest) obj;
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateCacheSecurityGroupRequest clone() {
        return (CreateCacheSecurityGroupRequest) super.clone();
    }

}
