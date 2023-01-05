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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of a Kubernetes <code>hostPath</code> volume. A <code>hostPath</code> volume mounts an
 * existing file or directory from the host node's filesystem into your pod. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/storage/volumes/#hostpath">hostPath</a> in the <i>Kubernetes
 * documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksHostPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksHostPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the file or directory on the host to mount into containers on the pod.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The path of the file or directory on the host to mount into containers on the pod.
     * </p>
     * 
     * @param path
     *        The path of the file or directory on the host to mount into containers on the pod.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the file or directory on the host to mount into containers on the pod.
     * </p>
     * 
     * @return The path of the file or directory on the host to mount into containers on the pod.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the file or directory on the host to mount into containers on the pod.
     * </p>
     * 
     * @param path
     *        The path of the file or directory on the host to mount into containers on the pod.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksHostPath withPath(String path) {
        setPath(path);
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
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksHostPath == false)
            return false;
        EksHostPath other = (EksHostPath) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public EksHostPath clone() {
        try {
            return (EksHostPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksHostPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
