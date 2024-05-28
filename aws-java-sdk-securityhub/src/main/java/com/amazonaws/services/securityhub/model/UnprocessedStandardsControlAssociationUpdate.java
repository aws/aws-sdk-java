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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about which control's enablement status could not be updated in a specified standard when calling
 * the <a
 * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
 * >BatchUpdateStandardsControlAssociations</a> API. This parameter also provides details about why the request was
 * unprocessed.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UnprocessedStandardsControlAssociationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedStandardsControlAssociationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of control and standard associations for which an update failed when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     */
    private StandardsControlAssociationUpdate standardsControlAssociationUpdate;
    /**
     * <p>
     * The error code for the unprocessed update of the control's enablement status in the specified standard.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The reason why a control's enablement status in the specified standard couldn't be updated.
     * </p>
     */
    private String errorReason;

    /**
     * <p>
     * An array of control and standard associations for which an update failed when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @param standardsControlAssociationUpdate
     *        An array of control and standard associations for which an update failed when calling <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        >BatchUpdateStandardsControlAssociations</a>.
     */

    public void setStandardsControlAssociationUpdate(StandardsControlAssociationUpdate standardsControlAssociationUpdate) {
        this.standardsControlAssociationUpdate = standardsControlAssociationUpdate;
    }

    /**
     * <p>
     * An array of control and standard associations for which an update failed when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @return An array of control and standard associations for which an update failed when calling <a href=
     *         "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *         >BatchUpdateStandardsControlAssociations</a>.
     */

    public StandardsControlAssociationUpdate getStandardsControlAssociationUpdate() {
        return this.standardsControlAssociationUpdate;
    }

    /**
     * <p>
     * An array of control and standard associations for which an update failed when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @param standardsControlAssociationUpdate
     *        An array of control and standard associations for which an update failed when calling <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        >BatchUpdateStandardsControlAssociations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedStandardsControlAssociationUpdate withStandardsControlAssociationUpdate(
            StandardsControlAssociationUpdate standardsControlAssociationUpdate) {
        setStandardsControlAssociationUpdate(standardsControlAssociationUpdate);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed update of the control's enablement status in the specified standard.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed update of the control's enablement status in the specified standard.
     * @see UnprocessedErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed update of the control's enablement status in the specified standard.
     * </p>
     * 
     * @return The error code for the unprocessed update of the control's enablement status in the specified standard.
     * @see UnprocessedErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed update of the control's enablement status in the specified standard.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed update of the control's enablement status in the specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedStandardsControlAssociationUpdate withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed update of the control's enablement status in the specified standard.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed update of the control's enablement status in the specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedStandardsControlAssociationUpdate withErrorCode(UnprocessedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason why a control's enablement status in the specified standard couldn't be updated.
     * </p>
     * 
     * @param errorReason
     *        The reason why a control's enablement status in the specified standard couldn't be updated.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * The reason why a control's enablement status in the specified standard couldn't be updated.
     * </p>
     * 
     * @return The reason why a control's enablement status in the specified standard couldn't be updated.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * The reason why a control's enablement status in the specified standard couldn't be updated.
     * </p>
     * 
     * @param errorReason
     *        The reason why a control's enablement status in the specified standard couldn't be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedStandardsControlAssociationUpdate withErrorReason(String errorReason) {
        setErrorReason(errorReason);
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
        if (getStandardsControlAssociationUpdate() != null)
            sb.append("StandardsControlAssociationUpdate: ").append(getStandardsControlAssociationUpdate()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedStandardsControlAssociationUpdate == false)
            return false;
        UnprocessedStandardsControlAssociationUpdate other = (UnprocessedStandardsControlAssociationUpdate) obj;
        if (other.getStandardsControlAssociationUpdate() == null ^ this.getStandardsControlAssociationUpdate() == null)
            return false;
        if (other.getStandardsControlAssociationUpdate() != null
                && other.getStandardsControlAssociationUpdate().equals(this.getStandardsControlAssociationUpdate()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsControlAssociationUpdate() == null) ? 0 : getStandardsControlAssociationUpdate().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedStandardsControlAssociationUpdate clone() {
        try {
            return (UnprocessedStandardsControlAssociationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.UnprocessedStandardsControlAssociationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
