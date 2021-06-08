/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) of the application that was augmented with attributes.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon resource name (ARN) of the application that was augmented with attributes.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon resource name (ARN) of the application that was augmented with attributes.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the application that was augmented with attributes.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the application that was augmented with attributes.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the application that was augmented with attributes.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon resource name (ARN) of the application that was augmented with attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon resource name (ARN) that specifies the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource.
     * </p>
     * 
     * @return The Amazon resource name (ARN) that specifies the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) that specifies the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon resource name (ARN) that specifies the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceResult == false)
            return false;
        AssociateResourceResult other = (AssociateResourceResult) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceResult clone() {
        try {
            return (AssociateResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
