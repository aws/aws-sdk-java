/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about errors in a BatchDisassociateApprovalRuleTemplateFromRepositories operation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDisassociateApprovalRuleTemplateFromRepositoriesError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateApprovalRuleTemplateFromRepositoriesError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository where the association with the template was not able to be removed.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * An error code that specifies whether the repository name was not valid or not found.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message that provides details about why the repository name was either not found or not valid.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of the repository where the association with the template was not able to be removed.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the association with the template was not able to be removed.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the association with the template was not able to be removed.
     * </p>
     * 
     * @return The name of the repository where the association with the template was not able to be removed.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the association with the template was not able to be removed.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the association with the template was not able to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesError withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * An error code that specifies whether the repository name was not valid or not found.
     * </p>
     * 
     * @param errorCode
     *        An error code that specifies whether the repository name was not valid or not found.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the repository name was not valid or not found.
     * </p>
     * 
     * @return An error code that specifies whether the repository name was not valid or not found.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the repository name was not valid or not found.
     * </p>
     * 
     * @param errorCode
     *        An error code that specifies whether the repository name was not valid or not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message that provides details about why the repository name was either not found or not valid.
     * </p>
     * 
     * @param errorMessage
     *        An error message that provides details about why the repository name was either not found or not valid.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message that provides details about why the repository name was either not found or not valid.
     * </p>
     * 
     * @return An error message that provides details about why the repository name was either not found or not valid.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message that provides details about why the repository name was either not found or not valid.
     * </p>
     * 
     * @param errorMessage
     *        An error message that provides details about why the repository name was either not found or not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateApprovalRuleTemplateFromRepositoriesError withErrorMessage(String errorMessage) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
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

        if (obj instanceof BatchDisassociateApprovalRuleTemplateFromRepositoriesError == false)
            return false;
        BatchDisassociateApprovalRuleTemplateFromRepositoriesError other = (BatchDisassociateApprovalRuleTemplateFromRepositoriesError) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateApprovalRuleTemplateFromRepositoriesError clone() {
        try {
            return (BatchDisassociateApprovalRuleTemplateFromRepositoriesError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
