/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the resource being evaluated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/InsightResourceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightResourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     */
    private InsightStatus insightStatus;
    /**
     * <p>
     * The Kubernetes resource URI if applicable.
     * </p>
     */
    private String kubernetesResourceUri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) if applicable.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @param insightStatus
     *        An object containing more detail on the status of the insight resource.
     */

    public void setInsightStatus(InsightStatus insightStatus) {
        this.insightStatus = insightStatus;
    }

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @return An object containing more detail on the status of the insight resource.
     */

    public InsightStatus getInsightStatus() {
        return this.insightStatus;
    }

    /**
     * <p>
     * An object containing more detail on the status of the insight resource.
     * </p>
     * 
     * @param insightStatus
     *        An object containing more detail on the status of the insight resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResourceDetail withInsightStatus(InsightStatus insightStatus) {
        setInsightStatus(insightStatus);
        return this;
    }

    /**
     * <p>
     * The Kubernetes resource URI if applicable.
     * </p>
     * 
     * @param kubernetesResourceUri
     *        The Kubernetes resource URI if applicable.
     */

    public void setKubernetesResourceUri(String kubernetesResourceUri) {
        this.kubernetesResourceUri = kubernetesResourceUri;
    }

    /**
     * <p>
     * The Kubernetes resource URI if applicable.
     * </p>
     * 
     * @return The Kubernetes resource URI if applicable.
     */

    public String getKubernetesResourceUri() {
        return this.kubernetesResourceUri;
    }

    /**
     * <p>
     * The Kubernetes resource URI if applicable.
     * </p>
     * 
     * @param kubernetesResourceUri
     *        The Kubernetes resource URI if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResourceDetail withKubernetesResourceUri(String kubernetesResourceUri) {
        setKubernetesResourceUri(kubernetesResourceUri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) if applicable.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) if applicable.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) if applicable.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) if applicable.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) if applicable.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightResourceDetail withArn(String arn) {
        setArn(arn);
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
        if (getInsightStatus() != null)
            sb.append("InsightStatus: ").append(getInsightStatus()).append(",");
        if (getKubernetesResourceUri() != null)
            sb.append("KubernetesResourceUri: ").append(getKubernetesResourceUri()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightResourceDetail == false)
            return false;
        InsightResourceDetail other = (InsightResourceDetail) obj;
        if (other.getInsightStatus() == null ^ this.getInsightStatus() == null)
            return false;
        if (other.getInsightStatus() != null && other.getInsightStatus().equals(this.getInsightStatus()) == false)
            return false;
        if (other.getKubernetesResourceUri() == null ^ this.getKubernetesResourceUri() == null)
            return false;
        if (other.getKubernetesResourceUri() != null && other.getKubernetesResourceUri().equals(this.getKubernetesResourceUri()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightStatus() == null) ? 0 : getInsightStatus().hashCode());
        hashCode = prime * hashCode + ((getKubernetesResourceUri() == null) ? 0 : getKubernetesResourceUri().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public InsightResourceDetail clone() {
        try {
            return (InsightResourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.InsightResourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
