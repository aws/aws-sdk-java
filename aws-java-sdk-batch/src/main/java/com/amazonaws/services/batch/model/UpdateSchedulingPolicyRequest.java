/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <code>UpdateSchedulingPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateSchedulingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSchedulingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy to update.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The fair share policy.
     * </p>
     */
    private FairsharePolicy fairsharePolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scheduling policy to update.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scheduling policy to update.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scheduling policy to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchedulingPolicyRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The fair share policy.
     * </p>
     * 
     * @param fairsharePolicy
     *        The fair share policy.
     */

    public void setFairsharePolicy(FairsharePolicy fairsharePolicy) {
        this.fairsharePolicy = fairsharePolicy;
    }

    /**
     * <p>
     * The fair share policy.
     * </p>
     * 
     * @return The fair share policy.
     */

    public FairsharePolicy getFairsharePolicy() {
        return this.fairsharePolicy;
    }

    /**
     * <p>
     * The fair share policy.
     * </p>
     * 
     * @param fairsharePolicy
     *        The fair share policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchedulingPolicyRequest withFairsharePolicy(FairsharePolicy fairsharePolicy) {
        setFairsharePolicy(fairsharePolicy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFairsharePolicy() != null)
            sb.append("FairsharePolicy: ").append(getFairsharePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSchedulingPolicyRequest == false)
            return false;
        UpdateSchedulingPolicyRequest other = (UpdateSchedulingPolicyRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFairsharePolicy() == null ^ this.getFairsharePolicy() == null)
            return false;
        if (other.getFairsharePolicy() != null && other.getFairsharePolicy().equals(this.getFairsharePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFairsharePolicy() == null) ? 0 : getFairsharePolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSchedulingPolicyRequest clone() {
        return (UpdateSchedulingPolicyRequest) super.clone();
    }

}
