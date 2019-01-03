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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes details of the list of the findings that cannot be imported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ImportFindingsError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportFindingsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the error made during the BatchImportFindings operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The code of the error made during the BatchImportFindings operation.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message of the error made during the BatchImportFindings operation.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The id of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param id
     *        The id of the error made during the BatchImportFindings operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The id of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @return The id of the error made during the BatchImportFindings operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The id of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param id
     *        The id of the error made during the BatchImportFindings operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFindingsError withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The code of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param errorCode
     *        The code of the error made during the BatchImportFindings operation.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @return The code of the error made during the BatchImportFindings operation.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param errorCode
     *        The code of the error made during the BatchImportFindings operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFindingsError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param errorMessage
     *        The message of the error made during the BatchImportFindings operation.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @return The message of the error made during the BatchImportFindings operation.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message of the error made during the BatchImportFindings operation.
     * </p>
     * 
     * @param errorMessage
     *        The message of the error made during the BatchImportFindings operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportFindingsError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportFindingsError == false)
            return false;
        ImportFindingsError other = (ImportFindingsError) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImportFindingsError clone() {
        try {
            return (ImportFindingsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ImportFindingsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
