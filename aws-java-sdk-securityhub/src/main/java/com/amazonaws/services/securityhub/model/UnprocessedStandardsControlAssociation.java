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
 * Provides details about which control's enablement status couldn't be retrieved in a specified standard when calling
 * <a href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html">
 * BatchUpdateStandardsControlAssociations</a>. This parameter also provides details about why the request was
 * unprocessed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UnprocessedStandardsControlAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedStandardsControlAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array with one or more objects that includes a security control (identified with
     * <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the Amazon
     * Resource Name (ARN) of a standard. This parameter shows the specific controls for which the enablement status
     * couldn't be retrieved in specified standards when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     */
    private StandardsControlAssociationId standardsControlAssociationId;
    /**
     * <p>
     * The error code for the unprocessed standard and control association.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The reason why the standard and control association was unprocessed.
     * </p>
     */
    private String errorReason;

    /**
     * <p>
     * An array with one or more objects that includes a security control (identified with
     * <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the Amazon
     * Resource Name (ARN) of a standard. This parameter shows the specific controls for which the enablement status
     * couldn't be retrieved in specified standards when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @param standardsControlAssociationId
     *        An array with one or more objects that includes a security control (identified with
     *        <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the
     *        Amazon Resource Name (ARN) of a standard. This parameter shows the specific controls for which the
     *        enablement status couldn't be retrieved in specified standards when calling <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        >BatchUpdateStandardsControlAssociations</a>.
     */

    public void setStandardsControlAssociationId(StandardsControlAssociationId standardsControlAssociationId) {
        this.standardsControlAssociationId = standardsControlAssociationId;
    }

    /**
     * <p>
     * An array with one or more objects that includes a security control (identified with
     * <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the Amazon
     * Resource Name (ARN) of a standard. This parameter shows the specific controls for which the enablement status
     * couldn't be retrieved in specified standards when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @return An array with one or more objects that includes a security control (identified with
     *         <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the
     *         Amazon Resource Name (ARN) of a standard. This parameter shows the specific controls for which the
     *         enablement status couldn't be retrieved in specified standards when calling <a href=
     *         "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *         >BatchUpdateStandardsControlAssociations</a>.
     */

    public StandardsControlAssociationId getStandardsControlAssociationId() {
        return this.standardsControlAssociationId;
    }

    /**
     * <p>
     * An array with one or more objects that includes a security control (identified with
     * <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the Amazon
     * Resource Name (ARN) of a standard. This parameter shows the specific controls for which the enablement status
     * couldn't be retrieved in specified standards when calling <a href=
     * "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     * >BatchUpdateStandardsControlAssociations</a>.
     * </p>
     * 
     * @param standardsControlAssociationId
     *        An array with one or more objects that includes a security control (identified with
     *        <code>SecurityControlId</code>, <code>SecurityControlArn</code>, or a mix of both parameters) and the
     *        Amazon Resource Name (ARN) of a standard. This parameter shows the specific controls for which the
     *        enablement status couldn't be retrieved in specified standards when calling <a href=
     *        "https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_BatchUpdateStandardsControlAssociations.html"
     *        >BatchUpdateStandardsControlAssociations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedStandardsControlAssociation withStandardsControlAssociationId(StandardsControlAssociationId standardsControlAssociationId) {
        setStandardsControlAssociationId(standardsControlAssociationId);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed standard and control association.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed standard and control association.
     * @see UnprocessedErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed standard and control association.
     * </p>
     * 
     * @return The error code for the unprocessed standard and control association.
     * @see UnprocessedErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the unprocessed standard and control association.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed standard and control association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedStandardsControlAssociation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code for the unprocessed standard and control association.
     * </p>
     * 
     * @param errorCode
     *        The error code for the unprocessed standard and control association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnprocessedErrorCode
     */

    public UnprocessedStandardsControlAssociation withErrorCode(UnprocessedErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the standard and control association was unprocessed.
     * </p>
     * 
     * @param errorReason
     *        The reason why the standard and control association was unprocessed.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * The reason why the standard and control association was unprocessed.
     * </p>
     * 
     * @return The reason why the standard and control association was unprocessed.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * The reason why the standard and control association was unprocessed.
     * </p>
     * 
     * @param errorReason
     *        The reason why the standard and control association was unprocessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedStandardsControlAssociation withErrorReason(String errorReason) {
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
        if (getStandardsControlAssociationId() != null)
            sb.append("StandardsControlAssociationId: ").append(getStandardsControlAssociationId()).append(",");
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

        if (obj instanceof UnprocessedStandardsControlAssociation == false)
            return false;
        UnprocessedStandardsControlAssociation other = (UnprocessedStandardsControlAssociation) obj;
        if (other.getStandardsControlAssociationId() == null ^ this.getStandardsControlAssociationId() == null)
            return false;
        if (other.getStandardsControlAssociationId() != null
                && other.getStandardsControlAssociationId().equals(this.getStandardsControlAssociationId()) == false)
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

        hashCode = prime * hashCode + ((getStandardsControlAssociationId() == null) ? 0 : getStandardsControlAssociationId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedStandardsControlAssociation clone() {
        try {
            return (UnprocessedStandardsControlAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.UnprocessedStandardsControlAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
