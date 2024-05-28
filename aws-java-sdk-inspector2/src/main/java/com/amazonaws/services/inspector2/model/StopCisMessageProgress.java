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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The stop CIS message progress.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StopCisMessageProgress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopCisMessageProgress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The progress' error checks.
     * </p>
     */
    private Integer errorChecks;
    /**
     * <p>
     * The progress' failed checks.
     * </p>
     */
    private Integer failedChecks;
    /**
     * <p>
     * The progress' informational checks.
     * </p>
     */
    private Integer informationalChecks;
    /**
     * <p>
     * The progress' not applicable checks.
     * </p>
     */
    private Integer notApplicableChecks;
    /**
     * <p>
     * The progress' not evaluated checks.
     * </p>
     */
    private Integer notEvaluatedChecks;
    /**
     * <p>
     * The progress' successful checks.
     * </p>
     */
    private Integer successfulChecks;
    /**
     * <p>
     * The progress' total checks.
     * </p>
     */
    private Integer totalChecks;
    /**
     * <p>
     * The progress' unknown checks.
     * </p>
     */
    private Integer unknownChecks;

    /**
     * <p>
     * The progress' error checks.
     * </p>
     * 
     * @param errorChecks
     *        The progress' error checks.
     */

    public void setErrorChecks(Integer errorChecks) {
        this.errorChecks = errorChecks;
    }

    /**
     * <p>
     * The progress' error checks.
     * </p>
     * 
     * @return The progress' error checks.
     */

    public Integer getErrorChecks() {
        return this.errorChecks;
    }

    /**
     * <p>
     * The progress' error checks.
     * </p>
     * 
     * @param errorChecks
     *        The progress' error checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withErrorChecks(Integer errorChecks) {
        setErrorChecks(errorChecks);
        return this;
    }

    /**
     * <p>
     * The progress' failed checks.
     * </p>
     * 
     * @param failedChecks
     *        The progress' failed checks.
     */

    public void setFailedChecks(Integer failedChecks) {
        this.failedChecks = failedChecks;
    }

    /**
     * <p>
     * The progress' failed checks.
     * </p>
     * 
     * @return The progress' failed checks.
     */

    public Integer getFailedChecks() {
        return this.failedChecks;
    }

    /**
     * <p>
     * The progress' failed checks.
     * </p>
     * 
     * @param failedChecks
     *        The progress' failed checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withFailedChecks(Integer failedChecks) {
        setFailedChecks(failedChecks);
        return this;
    }

    /**
     * <p>
     * The progress' informational checks.
     * </p>
     * 
     * @param informationalChecks
     *        The progress' informational checks.
     */

    public void setInformationalChecks(Integer informationalChecks) {
        this.informationalChecks = informationalChecks;
    }

    /**
     * <p>
     * The progress' informational checks.
     * </p>
     * 
     * @return The progress' informational checks.
     */

    public Integer getInformationalChecks() {
        return this.informationalChecks;
    }

    /**
     * <p>
     * The progress' informational checks.
     * </p>
     * 
     * @param informationalChecks
     *        The progress' informational checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withInformationalChecks(Integer informationalChecks) {
        setInformationalChecks(informationalChecks);
        return this;
    }

    /**
     * <p>
     * The progress' not applicable checks.
     * </p>
     * 
     * @param notApplicableChecks
     *        The progress' not applicable checks.
     */

    public void setNotApplicableChecks(Integer notApplicableChecks) {
        this.notApplicableChecks = notApplicableChecks;
    }

    /**
     * <p>
     * The progress' not applicable checks.
     * </p>
     * 
     * @return The progress' not applicable checks.
     */

    public Integer getNotApplicableChecks() {
        return this.notApplicableChecks;
    }

    /**
     * <p>
     * The progress' not applicable checks.
     * </p>
     * 
     * @param notApplicableChecks
     *        The progress' not applicable checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withNotApplicableChecks(Integer notApplicableChecks) {
        setNotApplicableChecks(notApplicableChecks);
        return this;
    }

    /**
     * <p>
     * The progress' not evaluated checks.
     * </p>
     * 
     * @param notEvaluatedChecks
     *        The progress' not evaluated checks.
     */

    public void setNotEvaluatedChecks(Integer notEvaluatedChecks) {
        this.notEvaluatedChecks = notEvaluatedChecks;
    }

    /**
     * <p>
     * The progress' not evaluated checks.
     * </p>
     * 
     * @return The progress' not evaluated checks.
     */

    public Integer getNotEvaluatedChecks() {
        return this.notEvaluatedChecks;
    }

    /**
     * <p>
     * The progress' not evaluated checks.
     * </p>
     * 
     * @param notEvaluatedChecks
     *        The progress' not evaluated checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withNotEvaluatedChecks(Integer notEvaluatedChecks) {
        setNotEvaluatedChecks(notEvaluatedChecks);
        return this;
    }

    /**
     * <p>
     * The progress' successful checks.
     * </p>
     * 
     * @param successfulChecks
     *        The progress' successful checks.
     */

    public void setSuccessfulChecks(Integer successfulChecks) {
        this.successfulChecks = successfulChecks;
    }

    /**
     * <p>
     * The progress' successful checks.
     * </p>
     * 
     * @return The progress' successful checks.
     */

    public Integer getSuccessfulChecks() {
        return this.successfulChecks;
    }

    /**
     * <p>
     * The progress' successful checks.
     * </p>
     * 
     * @param successfulChecks
     *        The progress' successful checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withSuccessfulChecks(Integer successfulChecks) {
        setSuccessfulChecks(successfulChecks);
        return this;
    }

    /**
     * <p>
     * The progress' total checks.
     * </p>
     * 
     * @param totalChecks
     *        The progress' total checks.
     */

    public void setTotalChecks(Integer totalChecks) {
        this.totalChecks = totalChecks;
    }

    /**
     * <p>
     * The progress' total checks.
     * </p>
     * 
     * @return The progress' total checks.
     */

    public Integer getTotalChecks() {
        return this.totalChecks;
    }

    /**
     * <p>
     * The progress' total checks.
     * </p>
     * 
     * @param totalChecks
     *        The progress' total checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withTotalChecks(Integer totalChecks) {
        setTotalChecks(totalChecks);
        return this;
    }

    /**
     * <p>
     * The progress' unknown checks.
     * </p>
     * 
     * @param unknownChecks
     *        The progress' unknown checks.
     */

    public void setUnknownChecks(Integer unknownChecks) {
        this.unknownChecks = unknownChecks;
    }

    /**
     * <p>
     * The progress' unknown checks.
     * </p>
     * 
     * @return The progress' unknown checks.
     */

    public Integer getUnknownChecks() {
        return this.unknownChecks;
    }

    /**
     * <p>
     * The progress' unknown checks.
     * </p>
     * 
     * @param unknownChecks
     *        The progress' unknown checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisMessageProgress withUnknownChecks(Integer unknownChecks) {
        setUnknownChecks(unknownChecks);
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
        if (getErrorChecks() != null)
            sb.append("ErrorChecks: ").append(getErrorChecks()).append(",");
        if (getFailedChecks() != null)
            sb.append("FailedChecks: ").append(getFailedChecks()).append(",");
        if (getInformationalChecks() != null)
            sb.append("InformationalChecks: ").append(getInformationalChecks()).append(",");
        if (getNotApplicableChecks() != null)
            sb.append("NotApplicableChecks: ").append(getNotApplicableChecks()).append(",");
        if (getNotEvaluatedChecks() != null)
            sb.append("NotEvaluatedChecks: ").append(getNotEvaluatedChecks()).append(",");
        if (getSuccessfulChecks() != null)
            sb.append("SuccessfulChecks: ").append(getSuccessfulChecks()).append(",");
        if (getTotalChecks() != null)
            sb.append("TotalChecks: ").append(getTotalChecks()).append(",");
        if (getUnknownChecks() != null)
            sb.append("UnknownChecks: ").append(getUnknownChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopCisMessageProgress == false)
            return false;
        StopCisMessageProgress other = (StopCisMessageProgress) obj;
        if (other.getErrorChecks() == null ^ this.getErrorChecks() == null)
            return false;
        if (other.getErrorChecks() != null && other.getErrorChecks().equals(this.getErrorChecks()) == false)
            return false;
        if (other.getFailedChecks() == null ^ this.getFailedChecks() == null)
            return false;
        if (other.getFailedChecks() != null && other.getFailedChecks().equals(this.getFailedChecks()) == false)
            return false;
        if (other.getInformationalChecks() == null ^ this.getInformationalChecks() == null)
            return false;
        if (other.getInformationalChecks() != null && other.getInformationalChecks().equals(this.getInformationalChecks()) == false)
            return false;
        if (other.getNotApplicableChecks() == null ^ this.getNotApplicableChecks() == null)
            return false;
        if (other.getNotApplicableChecks() != null && other.getNotApplicableChecks().equals(this.getNotApplicableChecks()) == false)
            return false;
        if (other.getNotEvaluatedChecks() == null ^ this.getNotEvaluatedChecks() == null)
            return false;
        if (other.getNotEvaluatedChecks() != null && other.getNotEvaluatedChecks().equals(this.getNotEvaluatedChecks()) == false)
            return false;
        if (other.getSuccessfulChecks() == null ^ this.getSuccessfulChecks() == null)
            return false;
        if (other.getSuccessfulChecks() != null && other.getSuccessfulChecks().equals(this.getSuccessfulChecks()) == false)
            return false;
        if (other.getTotalChecks() == null ^ this.getTotalChecks() == null)
            return false;
        if (other.getTotalChecks() != null && other.getTotalChecks().equals(this.getTotalChecks()) == false)
            return false;
        if (other.getUnknownChecks() == null ^ this.getUnknownChecks() == null)
            return false;
        if (other.getUnknownChecks() != null && other.getUnknownChecks().equals(this.getUnknownChecks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorChecks() == null) ? 0 : getErrorChecks().hashCode());
        hashCode = prime * hashCode + ((getFailedChecks() == null) ? 0 : getFailedChecks().hashCode());
        hashCode = prime * hashCode + ((getInformationalChecks() == null) ? 0 : getInformationalChecks().hashCode());
        hashCode = prime * hashCode + ((getNotApplicableChecks() == null) ? 0 : getNotApplicableChecks().hashCode());
        hashCode = prime * hashCode + ((getNotEvaluatedChecks() == null) ? 0 : getNotEvaluatedChecks().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulChecks() == null) ? 0 : getSuccessfulChecks().hashCode());
        hashCode = prime * hashCode + ((getTotalChecks() == null) ? 0 : getTotalChecks().hashCode());
        hashCode = prime * hashCode + ((getUnknownChecks() == null) ? 0 : getUnknownChecks().hashCode());
        return hashCode;
    }

    @Override
    public StopCisMessageProgress clone() {
        try {
            return (StopCisMessageProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StopCisMessageProgressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
