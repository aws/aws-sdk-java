/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * See the example below to learn how to create a request body.
 * </p>
 */
public class DescribeInstancesHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment ID.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;
    /**
     * <p>
     * Specifies the next token of the request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @param environmentName
     *        Specifies the AWS Elastic Beanstalk environment name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @return Specifies the AWS Elastic Beanstalk environment name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment name.
     * </p>
     * 
     * @param environmentName
     *        Specifies the AWS Elastic Beanstalk environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment ID.
     * </p>
     * 
     * @param environmentId
     *        Specifies the AWS Elastic Beanstalk environment ID.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment ID.
     * </p>
     * 
     * @return Specifies the AWS Elastic Beanstalk environment ID.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * Specifies the AWS Elastic Beanstalk environment ID.
     * </p>
     * 
     * @param environmentId
     *        Specifies the AWS Elastic Beanstalk environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     * 
     * @return Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic
     *         Beanstalk only returns a list of instances.
     * @see InstancesHealthAttribute
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic
     *        Beanstalk only returns a list of instances.
     * @see InstancesHealthAttribute
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
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic
     *        Beanstalk only returns a list of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancesHealthAttribute
     */

    public DescribeInstancesHealthRequest withAttributeNames(String... attributeNames) {
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
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic
     *        Beanstalk only returns a list of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancesHealthAttribute
     */

    public DescribeInstancesHealthRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic Beanstalk
     * only returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. If no attribute names are specified, AWS Elastic
     *        Beanstalk only returns a list of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancesHealthAttribute
     */

    public DescribeInstancesHealthRequest withAttributeNames(InstancesHealthAttribute... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length);
        for (InstancesHealthAttribute value : attributeNames) {
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
     * <p>
     * Specifies the next token of the request.
     * </p>
     * 
     * @param nextToken
     *        Specifies the next token of the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies the next token of the request.
     * </p>
     * 
     * @return Specifies the next token of the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies the next token of the request.
     * </p>
     * 
     * @param nextToken
     *        Specifies the next token of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesHealthRequest == false)
            return false;
        DescribeInstancesHealthRequest other = (DescribeInstancesHealthRequest) obj;
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancesHealthRequest clone() {
        return (DescribeInstancesHealthRequest) super.clone();
    }
}
