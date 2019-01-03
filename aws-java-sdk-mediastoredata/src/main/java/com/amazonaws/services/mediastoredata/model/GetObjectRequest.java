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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to <a
     * href=
     * "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/rfc2616/rfc2616
     * -sec14.html#sec14.35</a>.
     * </p>
     */
    private String range;

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *        <p>
     *        For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *        the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *        </p>
     *        <p>
     *        Do not include the container name in this path.
     *        </p>
     *        <p>
     *        If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *        have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *        service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *        subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *        </p>
     *        <p>
     *        There is no correlation between the path to the source and the path (folders) in the container in AWS
     *        Elemental MediaStore.
     *        </p>
     *        <p>
     *        For more information about folders and how they exist in a container, see the <a
     *        href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *        </p>
     *        <p>
     *        The file name is the name that is assigned to the file that you upload. The file can have the same name
     *        inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or
     *        omit an extension.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @return The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *         name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *         <p>
     *         For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *         the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *         </p>
     *         <p>
     *         Do not include the container name in this path.
     *         </p>
     *         <p>
     *         If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *         have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *         service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *         subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *         </p>
     *         <p>
     *         There is no correlation between the path to the source and the path (folders) in the container in AWS
     *         Elemental MediaStore.
     *         </p>
     *         <p>
     *         For more information about folders and how they exist in a container, see the <a
     *         href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *         </p>
     *         <p>
     *         The file name is the name that is assigned to the file that you upload. The file can have the same name
     *         inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include
     *         or omit an extension.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *        <p>
     *        For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *        the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *        </p>
     *        <p>
     *        Do not include the container name in this path.
     *        </p>
     *        <p>
     *        If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *        have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *        service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *        subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *        </p>
     *        <p>
     *        There is no correlation between the path to the source and the path (folders) in the container in AWS
     *        Elemental MediaStore.
     *        </p>
     *        <p>
     *        For more information about folders and how they exist in a container, see the <a
     *        href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *        </p>
     *        <p>
     *        The file name is the name that is assigned to the file that you upload. The file can have the same name
     *        inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or
     *        omit an extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to <a
     * href=
     * "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/rfc2616/rfc2616
     * -sec14.html#sec14.35</a>.
     * </p>
     * 
     * @param range
     *        The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to
     *        <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/
     *        rfc2616/rfc2616-sec14.html#sec14.35</a>.
     */

    public void setRange(String range) {
        this.range = range;
    }

    /**
     * <p>
     * The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to <a
     * href=
     * "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/rfc2616/rfc2616
     * -sec14.html#sec14.35</a>.
     * </p>
     * 
     * @return The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to
     *         <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/
     *         rfc2616/rfc2616-sec14.html#sec14.35</a>.
     */

    public String getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to <a
     * href=
     * "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/rfc2616/rfc2616
     * -sec14.html#sec14.35</a>.
     * </p>
     * 
     * @param range
     *        The range bytes of an object to retrieve. For more information about the <code>Range</code> header, go to
     *        <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35">http://www.w3.org/Protocols/
     *        rfc2616/rfc2616-sec14.html#sec14.35</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectRequest withRange(String range) {
        setRange(range);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectRequest == false)
            return false;
        GetObjectRequest other = (GetObjectRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        return hashCode;
    }

    @Override
    public GetObjectRequest clone() {
        return (GetObjectRequest) super.clone();
    }

}
