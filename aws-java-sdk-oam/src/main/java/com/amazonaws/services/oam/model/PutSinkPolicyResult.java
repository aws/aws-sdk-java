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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/PutSinkPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSinkPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the sink.
     * </p>
     */
    private String sinkArn;
    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     */
    private String sinkId;
    /**
     * <p>
     * The policy that you specified.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The ARN of the sink.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink.
     */

    public void setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink.
     * </p>
     * 
     * @return The ARN of the sink.
     */

    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * <p>
     * The ARN of the sink.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSinkPolicyResult withSinkArn(String sinkArn) {
        setSinkArn(sinkArn);
        return this;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param sinkId
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public void setSinkId(String sinkId) {
        this.sinkId = sinkId;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @return The random ID string that Amazon Web Services generated as part of the sink ARN.
     */

    public String getSinkId() {
        return this.sinkId;
    }

    /**
     * <p>
     * The random ID string that Amazon Web Services generated as part of the sink ARN.
     * </p>
     * 
     * @param sinkId
     *        The random ID string that Amazon Web Services generated as part of the sink ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSinkPolicyResult withSinkId(String sinkId) {
        setSinkId(sinkId);
        return this;
    }

    /**
     * <p>
     * The policy that you specified.
     * </p>
     * 
     * @param policy
     *        The policy that you specified.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy that you specified.
     * </p>
     * 
     * @return The policy that you specified.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy that you specified.
     * </p>
     * 
     * @param policy
     *        The policy that you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSinkPolicyResult withPolicy(String policy) {
        setPolicy(policy);
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
        if (getSinkArn() != null)
            sb.append("SinkArn: ").append(getSinkArn()).append(",");
        if (getSinkId() != null)
            sb.append("SinkId: ").append(getSinkId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSinkPolicyResult == false)
            return false;
        PutSinkPolicyResult other = (PutSinkPolicyResult) obj;
        if (other.getSinkArn() == null ^ this.getSinkArn() == null)
            return false;
        if (other.getSinkArn() != null && other.getSinkArn().equals(this.getSinkArn()) == false)
            return false;
        if (other.getSinkId() == null ^ this.getSinkId() == null)
            return false;
        if (other.getSinkId() != null && other.getSinkId().equals(this.getSinkId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSinkArn() == null) ? 0 : getSinkArn().hashCode());
        hashCode = prime * hashCode + ((getSinkId() == null) ? 0 : getSinkId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutSinkPolicyResult clone() {
        try {
            return (PutSinkPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
