/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object that contains a path format that will be applied when Amazon Lex reads the transcript file in the bucket
 * you provide. Specify this object if you only want Lex to read a subset of files in your Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/PathFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only
     * want Lex to read the files under this set of sub-folders.
     * </p>
     */
    private java.util.List<String> objectPrefixes;

    /**
     * <p>
     * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only
     * want Lex to read the files under this set of sub-folders.
     * </p>
     * 
     * @return A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you
     *         only want Lex to read the files under this set of sub-folders.
     */

    public java.util.List<String> getObjectPrefixes() {
        return objectPrefixes;
    }

    /**
     * <p>
     * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only
     * want Lex to read the files under this set of sub-folders.
     * </p>
     * 
     * @param objectPrefixes
     *        A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you
     *        only want Lex to read the files under this set of sub-folders.
     */

    public void setObjectPrefixes(java.util.Collection<String> objectPrefixes) {
        if (objectPrefixes == null) {
            this.objectPrefixes = null;
            return;
        }

        this.objectPrefixes = new java.util.ArrayList<String>(objectPrefixes);
    }

    /**
     * <p>
     * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only
     * want Lex to read the files under this set of sub-folders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectPrefixes(java.util.Collection)} or {@link #withObjectPrefixes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param objectPrefixes
     *        A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you
     *        only want Lex to read the files under this set of sub-folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFormat withObjectPrefixes(String... objectPrefixes) {
        if (this.objectPrefixes == null) {
            setObjectPrefixes(new java.util.ArrayList<String>(objectPrefixes.length));
        }
        for (String ele : objectPrefixes) {
            this.objectPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you only
     * want Lex to read the files under this set of sub-folders.
     * </p>
     * 
     * @param objectPrefixes
     *        A list of Amazon S3 prefixes that points to sub-folders in the Amazon S3 bucket. Specify this list if you
     *        only want Lex to read the files under this set of sub-folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathFormat withObjectPrefixes(java.util.Collection<String> objectPrefixes) {
        setObjectPrefixes(objectPrefixes);
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
        if (getObjectPrefixes() != null)
            sb.append("ObjectPrefixes: ").append(getObjectPrefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathFormat == false)
            return false;
        PathFormat other = (PathFormat) obj;
        if (other.getObjectPrefixes() == null ^ this.getObjectPrefixes() == null)
            return false;
        if (other.getObjectPrefixes() != null && other.getObjectPrefixes().equals(this.getObjectPrefixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectPrefixes() == null) ? 0 : getObjectPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public PathFormat clone() {
        try {
            return (PathFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PathFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
