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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for the get artifact request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArtifactUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     */
    private String artifactId;

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @param artifactId
     *        Unique Id for a artifact.
     */

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @return Unique Id for a artifact.
     */

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @param artifactId
     *        Unique Id for a artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArtifactUrlRequest withArtifactId(String artifactId) {
        setArtifactId(artifactId);
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
        if (getArtifactId() != null)
            sb.append("ArtifactId: ").append(getArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArtifactUrlRequest == false)
            return false;
        GetArtifactUrlRequest other = (GetArtifactUrlRequest) obj;
        if (other.getArtifactId() == null ^ this.getArtifactId() == null)
            return false;
        if (other.getArtifactId() != null && other.getArtifactId().equals(this.getArtifactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
        return hashCode;
    }

    @Override
    public GetArtifactUrlRequest clone() {
        return (GetArtifactUrlRequest) super.clone();
    }

}
