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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a job sent in response to a GetThirdPartyJobDetails request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ThirdPartyJobDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThirdPartyJobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier used to identify the job details in AWS CodePipeline.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The data to be returned by the third party job worker.
     * </p>
     */
    private ThirdPartyJobData data;
    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     * </p>
     */
    private String nonce;

    /**
     * <p>
     * The identifier used to identify the job details in AWS CodePipeline.
     * </p>
     * 
     * @param id
     *        The identifier used to identify the job details in AWS CodePipeline.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier used to identify the job details in AWS CodePipeline.
     * </p>
     * 
     * @return The identifier used to identify the job details in AWS CodePipeline.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier used to identify the job details in AWS CodePipeline.
     * </p>
     * 
     * @param id
     *        The identifier used to identify the job details in AWS CodePipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The data to be returned by the third party job worker.
     * </p>
     * 
     * @param data
     *        The data to be returned by the third party job worker.
     */

    public void setData(ThirdPartyJobData data) {
        this.data = data;
    }

    /**
     * <p>
     * The data to be returned by the third party job worker.
     * </p>
     * 
     * @return The data to be returned by the third party job worker.
     */

    public ThirdPartyJobData getData() {
        return this.data;
    }

    /**
     * <p>
     * The data to be returned by the third party job worker.
     * </p>
     * 
     * @param data
     *        The data to be returned by the third party job worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobDetails withData(ThirdPartyJobData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     */

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     * </p>
     * 
     * @return A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *         only one job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     */

    public String getNonce() {
        return this.nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Use this number in an <a>AcknowledgeThirdPartyJob</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobDetails withNonce(String nonce) {
        setNonce(nonce);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getNonce() != null)
            sb.append("Nonce: ").append(getNonce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartyJobDetails == false)
            return false;
        ThirdPartyJobDetails other = (ThirdPartyJobDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartyJobDetails clone() {
        try {
            return (ThirdPartyJobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ThirdPartyJobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
