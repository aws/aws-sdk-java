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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AlgorithmSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     */
    private String algorithmName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     */
    private String algorithmDescription;
    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     */
    private String algorithmStatus;

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm that is described by the summary.
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * 
     * @return The name of the algorithm that is described by the summary.
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm that is described by the summary.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm that is described by the summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSummary withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSummary withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A brief description of the algorithm.
     */

    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * 
     * @return A brief description of the algorithm.
     */

    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * <p>
     * A brief description of the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A brief description of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSummary withAlgorithmDescription(String algorithmDescription) {
        setAlgorithmDescription(algorithmDescription);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the algorithm was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     * 
     * @return A timestamp that shows when the algorithm was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the algorithm was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the algorithm was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The overall status of the algorithm.
     * @see AlgorithmStatus
     */

    public void setAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * 
     * @return The overall status of the algorithm.
     * @see AlgorithmStatus
     */

    public String getAlgorithmStatus() {
        return this.algorithmStatus;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The overall status of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmStatus
     */

    public AlgorithmSummary withAlgorithmStatus(String algorithmStatus) {
        setAlgorithmStatus(algorithmStatus);
        return this;
    }

    /**
     * <p>
     * The overall status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The overall status of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmStatus
     */

    public AlgorithmSummary withAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName()).append(",");
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: ").append(getAlgorithmDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getAlgorithmStatus() != null)
            sb.append("AlgorithmStatus: ").append(getAlgorithmStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmSummary == false)
            return false;
        AlgorithmSummary other = (AlgorithmSummary) obj;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlgorithmStatus() == null ^ this.getAlgorithmStatus() == null)
            return false;
        if (other.getAlgorithmStatus() != null && other.getAlgorithmStatus().equals(this.getAlgorithmStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmStatus() == null) ? 0 : getAlgorithmStatus().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmSummary clone() {
        try {
            return (AlgorithmSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AlgorithmSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
