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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestinationPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDestinationPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     * destination.
     * </p>
     */
    private String accessPolicy;

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * 
     * @param destinationName
     *        A name for an existing destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * 
     * @return A name for an existing destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * A name for an existing destination.
     * </p>
     * 
     * @param destinationName
     *        A name for an existing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationPolicyRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     * destination.
     * </p>
     * 
     * @param accessPolicy
     *        An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     *        destination.
     */

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     * destination.
     * </p>
     * 
     * @return An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     *         destination.
     */

    public String getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * <p>
     * An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     * destination.
     * </p>
     * 
     * @param accessPolicy
     *        An IAM policy document that authorizes cross-account users to deliver their log events to the associated
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDestinationPolicyRequest withAccessPolicy(String accessPolicy) {
        setAccessPolicy(accessPolicy);
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
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getAccessPolicy() != null)
            sb.append("AccessPolicy: ").append(getAccessPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDestinationPolicyRequest == false)
            return false;
        PutDestinationPolicyRequest other = (PutDestinationPolicyRequest) obj;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null)
            return false;
        if (other.getAccessPolicy() != null && other.getAccessPolicy().equals(this.getAccessPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutDestinationPolicyRequest clone() {
        return (PutDestinationPolicyRequest) super.clone();
    }

}
