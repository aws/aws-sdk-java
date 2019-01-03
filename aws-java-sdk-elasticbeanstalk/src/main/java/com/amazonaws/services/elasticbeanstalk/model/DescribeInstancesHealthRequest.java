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
 * Parameters for a call to <code>DescribeInstancesHealth</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeInstancesHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesHealthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by ID.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;
    /**
     * <p>
     * Specify the pagination token returned by a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by name.
     * </p>
     * 
     * @param environmentName
     *        Specify the AWS Elastic Beanstalk environment by name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by name.
     * </p>
     * 
     * @return Specify the AWS Elastic Beanstalk environment by name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by name.
     * </p>
     * 
     * @param environmentName
     *        Specify the AWS Elastic Beanstalk environment by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by ID.
     * </p>
     * 
     * @param environmentId
     *        Specify the AWS Elastic Beanstalk environment by ID.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by ID.
     * </p>
     * 
     * @return Specify the AWS Elastic Beanstalk environment by ID.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * Specify the AWS Elastic Beanstalk environment by ID.
     * </p>
     * 
     * @param environmentId
     *        Specify the AWS Elastic Beanstalk environment by ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     * 
     * @return Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>.
     *         If no attribute names are specified, returns a list of instances.
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
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>.
     *        If no attribute names are specified, returns a list of instances.
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
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>.
     *        If no attribute names are specified, returns a list of instances.
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
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>.
     *        If no attribute names are specified, returns a list of instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancesHealthAttribute
     */

    public DescribeInstancesHealthRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>. If no
     * attribute names are specified, returns a list of instances.
     * </p>
     * 
     * @param attributeNames
     *        Specifies the response elements you wish to receive. To retrieve all attributes, set to <code>All</code>.
     *        If no attribute names are specified, returns a list of instances.
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
     * Specify the pagination token returned by a previous call.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous call.
     * </p>
     * 
     * @return Specify the pagination token returned by a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous call.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancesHealthRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("AttributeNames: ").append(getAttributeNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
