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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DeleteFileShareInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteFileShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     */
    private String fileShareARN;
    /**
     * <p>
     * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS.
     * Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload
     * process, and the file share enters the FORCE_DELETING status.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be deleted.
     */

    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file share to be deleted.
     */

    public String getFileShareARN() {
        return this.fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be deleted.
     * </p>
     * 
     * @param fileShareARN
     *        The Amazon Resource Name (ARN) of the file share to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileShareRequest withFileShareARN(String fileShareARN) {
        setFileShareARN(fileShareARN);
        return this;
    }

    /**
     * <p>
     * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS.
     * Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload
     * process, and the file share enters the FORCE_DELETING status.
     * </p>
     * 
     * @param forceDelete
     *        If this value is set to true, the operation deletes a file share immediately and aborts all data uploads
     *        to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts
     *        the data upload process, and the file share enters the FORCE_DELETING status.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS.
     * Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload
     * process, and the file share enters the FORCE_DELETING status.
     * </p>
     * 
     * @return If this value is set to true, the operation deletes a file share immediately and aborts all data uploads
     *         to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts
     *         the data upload process, and the file share enters the FORCE_DELETING status.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS.
     * Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload
     * process, and the file share enters the FORCE_DELETING status.
     * </p>
     * 
     * @param forceDelete
     *        If this value is set to true, the operation deletes a file share immediately and aborts all data uploads
     *        to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts
     *        the data upload process, and the file share enters the FORCE_DELETING status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFileShareRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS.
     * Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload
     * process, and the file share enters the FORCE_DELETING status.
     * </p>
     * 
     * @return If this value is set to true, the operation deletes a file share immediately and aborts all data uploads
     *         to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts
     *         the data upload process, and the file share enters the FORCE_DELETING status.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: ").append(getFileShareARN()).append(",");
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileShareRequest == false)
            return false;
        DeleteFileShareRequest other = (DeleteFileShareRequest) obj;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFileShareRequest clone() {
        return (DeleteFileShareRequest) super.clone();
    }

}
