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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * See the example below to learn how to create a request body.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @param environmentName
     *        Specify the environment by name.</p>
     *        <p>
     *        You must specify either this or an EnvironmentName, or both.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @return Specify the environment by name.</p>
     *         <p>
     *         You must specify either this or an EnvironmentName, or both.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Specify the environment by name.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @param environmentName
     *        Specify the environment by name.</p>
     *        <p>
     *        You must specify either this or an EnvironmentName, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @param environmentId
     *        Specify the environment by ID.</p>
     *        <p>
     *        You must specify either this or an EnvironmentName, or both.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @return Specify the environment by ID.</p>
     *         <p>
     *         You must specify either this or an EnvironmentName, or both.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * Specify the environment by ID.
     * </p>
     * <p>
     * You must specify either this or an EnvironmentName, or both.
     * </p>
     * 
     * @param environmentId
     *        Specify the environment by ID.</p>
     *        <p>
     *        You must specify either this or an EnvironmentName, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentHealthRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     * 
     * @return Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no
     *         attribute names are specified, returns the name of the environment.
     * @see EnvironmentHealthAttribute
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     * 
     * @param attributeNames
     *        Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no
     *        attribute names are specified, returns the name of the environment.
     * @see EnvironmentHealthAttribute
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(attributeNames);
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no
     *        attribute names are specified, returns the name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealthAttribute
     */

    public DescribeEnvironmentHealthRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     * 
     * @param attributeNames
     *        Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no
     *        attribute names are specified, returns the name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealthAttribute
     */

    public DescribeEnvironmentHealthRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no attribute
     * names are specified, returns the name of the environment.
     * </p>
     * 
     * @param attributeNames
     *        Specify the response elements to return. To retrieve all attributes, set to <code>All</code>. If no
     *        attribute names are specified, returns the name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentHealthAttribute
     */

    public DescribeEnvironmentHealthRequest withAttributeNames(EnvironmentHealthAttribute... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length);
        for (EnvironmentHealthAttribute value : attributeNames) {
            attributeNamesCopy.add(value.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
        }
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentHealthRequest == false)
            return false;
        DescribeEnvironmentHealthRequest other = (DescribeEnvironmentHealthRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentHealthRequest clone() {
        return (DescribeEnvironmentHealthRequest) super.clone();
    }

}
