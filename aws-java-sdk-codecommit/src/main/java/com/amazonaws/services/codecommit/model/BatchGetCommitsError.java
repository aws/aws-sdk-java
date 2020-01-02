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
 * Returns information about errors in a BatchGetCommits operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommitsError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCommitsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not found.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message that provides detail about why the commit ID either was not found or was not valid.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     * 
     * @param commitId
     *        A commit ID that either could not be found or was not in a valid format.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     * 
     * @return A commit ID that either could not be found or was not in a valid format.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     * 
     * @param commitId
     *        A commit ID that either could not be found or was not in a valid format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsError withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not found.
     * </p>
     * 
     * @param errorCode
     *        An error code that specifies whether the commit ID was not valid or not found.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not found.
     * </p>
     * 
     * @return An error code that specifies whether the commit ID was not valid or not found.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not found.
     * </p>
     * 
     * @param errorCode
     *        An error code that specifies whether the commit ID was not valid or not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was not found or was not valid.
     * </p>
     * 
     * @param errorMessage
     *        An error message that provides detail about why the commit ID either was not found or was not valid.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was not found or was not valid.
     * </p>
     * 
     * @return An error message that provides detail about why the commit ID either was not found or was not valid.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was not found or was not valid.
     * </p>
     * 
     * @param errorMessage
     *        An error message that provides detail about why the commit ID either was not found or was not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsError withErrorMessage(String errorMessage) {
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
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

        if (obj instanceof BatchGetCommitsError == false)
            return false;
        BatchGetCommitsError other = (BatchGetCommitsError) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
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

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCommitsError clone() {
        try {
            return (BatchGetCommitsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.BatchGetCommitsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
