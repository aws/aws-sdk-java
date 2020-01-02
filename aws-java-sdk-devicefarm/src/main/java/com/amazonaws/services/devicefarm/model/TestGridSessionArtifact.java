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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Artifacts are video and other files that are produced in the process of running a browser in an automated context.
 * </p>
 * <note>
 * <p>
 * Video elements might be broken up into multiple artifacts as they grow in size during creation.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/TestGridSessionArtifact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestGridSessionArtifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file name of the artifact.
     * </p>
     */
    private String filename;
    /**
     * <p>
     * The kind of artifact.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A semi-stable URL to the content of the object.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The file name of the artifact.
     * </p>
     * 
     * @param filename
     *        The file name of the artifact.
     */

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * <p>
     * The file name of the artifact.
     * </p>
     * 
     * @return The file name of the artifact.
     */

    public String getFilename() {
        return this.filename;
    }

    /**
     * <p>
     * The file name of the artifact.
     * </p>
     * 
     * @param filename
     *        The file name of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionArtifact withFilename(String filename) {
        setFilename(filename);
        return this;
    }

    /**
     * <p>
     * The kind of artifact.
     * </p>
     * 
     * @param type
     *        The kind of artifact.
     * @see TestGridSessionArtifactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of artifact.
     * </p>
     * 
     * @return The kind of artifact.
     * @see TestGridSessionArtifactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of artifact.
     * </p>
     * 
     * @param type
     *        The kind of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionArtifactType
     */

    public TestGridSessionArtifact withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of artifact.
     * </p>
     * 
     * @param type
     *        The kind of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestGridSessionArtifactType
     */

    public TestGridSessionArtifact withType(TestGridSessionArtifactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A semi-stable URL to the content of the object.
     * </p>
     * 
     * @param url
     *        A semi-stable URL to the content of the object.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * A semi-stable URL to the content of the object.
     * </p>
     * 
     * @return A semi-stable URL to the content of the object.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * A semi-stable URL to the content of the object.
     * </p>
     * 
     * @param url
     *        A semi-stable URL to the content of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionArtifact withUrl(String url) {
        setUrl(url);
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
        if (getFilename() != null)
            sb.append("Filename: ").append(getFilename()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestGridSessionArtifact == false)
            return false;
        TestGridSessionArtifact other = (TestGridSessionArtifact) obj;
        if (other.getFilename() == null ^ this.getFilename() == null)
            return false;
        if (other.getFilename() != null && other.getFilename().equals(this.getFilename()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilename() == null) ? 0 : getFilename().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public TestGridSessionArtifact clone() {
        try {
            return (TestGridSessionArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.TestGridSessionArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
