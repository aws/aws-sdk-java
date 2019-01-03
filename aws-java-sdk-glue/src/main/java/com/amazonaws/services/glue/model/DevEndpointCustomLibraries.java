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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Custom libraries to be loaded into a DevEndpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DevEndpointCustomLibraries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevEndpointCustomLibraries implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * <p>
     * Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     * </p>
     */
    private String extraJarsS3Path;

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @return Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *         Multiple values must be complete paths separated by a comma.</p>
     *         <p>
     *         Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely
     *         on C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     *         are not yet supported.
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpointCustomLibraries withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * <p>
     * Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.</p>
     *        <p>
     *        Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * <p>
     * Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     * </p>
     * 
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.</p>
     *         <p>
     *         Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * <p>
     * Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.</p>
     *        <p>
     *        Please note that only pure Java/Scala libraries can currently be used on a DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpointCustomLibraries withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
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
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevEndpointCustomLibraries == false)
            return false;
        DevEndpointCustomLibraries other = (DevEndpointCustomLibraries) obj;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        return hashCode;
    }

    @Override
    public DevEndpointCustomLibraries clone() {
        try {
            return (DevEndpointCustomLibraries) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DevEndpointCustomLibrariesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
