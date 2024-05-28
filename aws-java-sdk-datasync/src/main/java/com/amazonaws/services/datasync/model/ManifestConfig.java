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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more information
 * and configuration examples, see <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what DataSync
 * transfers by using a manifest</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ManifestConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManifestConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies what DataSync uses the manifest for.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies the file format of your manifest. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     * >Creating a manifest</a>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Specifies the manifest that you want DataSync to use and where it's hosted.
     * </p>
     * <note>
     * <p>
     * You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     * </p>
     * <p>
     * If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're missing
     * the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * </note>
     */
    private SourceManifestConfig source;

    /**
     * <p>
     * Specifies what DataSync uses the manifest for.
     * </p>
     * 
     * @param action
     *        Specifies what DataSync uses the manifest for.
     * @see ManifestAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies what DataSync uses the manifest for.
     * </p>
     * 
     * @return Specifies what DataSync uses the manifest for.
     * @see ManifestAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies what DataSync uses the manifest for.
     * </p>
     * 
     * @param action
     *        Specifies what DataSync uses the manifest for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestAction
     */

    public ManifestConfig withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies what DataSync uses the manifest for.
     * </p>
     * 
     * @param action
     *        Specifies what DataSync uses the manifest for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestAction
     */

    public ManifestConfig withAction(ManifestAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the file format of your manifest. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     * >Creating a manifest</a>.
     * </p>
     * 
     * @param format
     *        Specifies the file format of your manifest. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     *        >Creating a manifest</a>.
     * @see ManifestFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Specifies the file format of your manifest. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     * >Creating a manifest</a>.
     * </p>
     * 
     * @return Specifies the file format of your manifest. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     *         >Creating a manifest</a>.
     * @see ManifestFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Specifies the file format of your manifest. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     * >Creating a manifest</a>.
     * </p>
     * 
     * @param format
     *        Specifies the file format of your manifest. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     *        >Creating a manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestFormat
     */

    public ManifestConfig withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Specifies the file format of your manifest. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     * >Creating a manifest</a>.
     * </p>
     * 
     * @param format
     *        Specifies the file format of your manifest. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-create"
     *        >Creating a manifest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestFormat
     */

    public ManifestConfig withFormat(ManifestFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the manifest that you want DataSync to use and where it's hosted.
     * </p>
     * <note>
     * <p>
     * You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     * </p>
     * <p>
     * If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're missing
     * the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * </note>
     * 
     * @param source
     *        Specifies the manifest that you want DataSync to use and where it's hosted.</p> <note>
     *        <p>
     *        You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     *        </p>
     *        <p>
     *        If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're
     *        missing the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *        >Providing DataSync access to your manifest</a>.
     *        </p>
     */

    public void setSource(SourceManifestConfig source) {
        this.source = source;
    }

    /**
     * <p>
     * Specifies the manifest that you want DataSync to use and where it's hosted.
     * </p>
     * <note>
     * <p>
     * You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     * </p>
     * <p>
     * If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're missing
     * the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * </note>
     * 
     * @return Specifies the manifest that you want DataSync to use and where it's hosted.</p> <note>
     *         <p>
     *         You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     *         </p>
     *         <p>
     *         If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're
     *         missing the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *         >Providing DataSync access to your manifest</a>.
     *         </p>
     */

    public SourceManifestConfig getSource() {
        return this.source;
    }

    /**
     * <p>
     * Specifies the manifest that you want DataSync to use and where it's hosted.
     * </p>
     * <note>
     * <p>
     * You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     * </p>
     * <p>
     * If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're missing
     * the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     * >Providing DataSync access to your manifest</a>.
     * </p>
     * </note>
     * 
     * @param source
     *        Specifies the manifest that you want DataSync to use and where it's hosted.</p> <note>
     *        <p>
     *        You must specify this parameter if you're configuring a new manifest on or after February 7, 2024.
     *        </p>
     *        <p>
     *        If you don't, you'll get a 400 status code and <code>ValidationException</code> error stating that you're
     *        missing the IAM role for DataSync to access the S3 bucket where you're hosting your manifest. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html#transferring-with-manifest-access"
     *        >Providing DataSync access to your manifest</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestConfig withSource(SourceManifestConfig source) {
        setSource(source);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManifestConfig == false)
            return false;
        ManifestConfig other = (ManifestConfig) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ManifestConfig clone() {
        try {
            return (ManifestConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ManifestConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
