/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceFolderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The folder in which evidence is stored.
     * </p>
     */
    private AssessmentEvidenceFolder evidenceFolder;

    /**
     * <p>
     * The folder in which evidence is stored.
     * </p>
     * 
     * @param evidenceFolder
     *        The folder in which evidence is stored.
     */

    public void setEvidenceFolder(AssessmentEvidenceFolder evidenceFolder) {
        this.evidenceFolder = evidenceFolder;
    }

    /**
     * <p>
     * The folder in which evidence is stored.
     * </p>
     * 
     * @return The folder in which evidence is stored.
     */

    public AssessmentEvidenceFolder getEvidenceFolder() {
        return this.evidenceFolder;
    }

    /**
     * <p>
     * The folder in which evidence is stored.
     * </p>
     * 
     * @param evidenceFolder
     *        The folder in which evidence is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFolderResult withEvidenceFolder(AssessmentEvidenceFolder evidenceFolder) {
        setEvidenceFolder(evidenceFolder);
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
        if (getEvidenceFolder() != null)
            sb.append("EvidenceFolder: ").append(getEvidenceFolder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceFolderResult == false)
            return false;
        GetEvidenceFolderResult other = (GetEvidenceFolderResult) obj;
        if (other.getEvidenceFolder() == null ^ this.getEvidenceFolder() == null)
            return false;
        if (other.getEvidenceFolder() != null && other.getEvidenceFolder().equals(this.getEvidenceFolder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidenceFolder() == null) ? 0 : getEvidenceFolder().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceFolderResult clone() {
        try {
            return (GetEvidenceFolderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
