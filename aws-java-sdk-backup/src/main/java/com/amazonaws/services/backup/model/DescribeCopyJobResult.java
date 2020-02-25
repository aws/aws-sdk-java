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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeCopyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCopyJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     */
    private CopyJob copyJob;

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     * 
     * @param copyJob
     *        Contains detailed information about a copy job.
     */

    public void setCopyJob(CopyJob copyJob) {
        this.copyJob = copyJob;
    }

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     * 
     * @return Contains detailed information about a copy job.
     */

    public CopyJob getCopyJob() {
        return this.copyJob;
    }

    /**
     * <p>
     * Contains detailed information about a copy job.
     * </p>
     * 
     * @param copyJob
     *        Contains detailed information about a copy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCopyJobResult withCopyJob(CopyJob copyJob) {
        setCopyJob(copyJob);
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
        if (getCopyJob() != null)
            sb.append("CopyJob: ").append(getCopyJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyJobResult == false)
            return false;
        DescribeCopyJobResult other = (DescribeCopyJobResult) obj;
        if (other.getCopyJob() == null ^ this.getCopyJob() == null)
            return false;
        if (other.getCopyJob() != null && other.getCopyJob().equals(this.getCopyJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJob() == null) ? 0 : getCopyJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCopyJobResult clone() {
        try {
            return (DescribeCopyJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
