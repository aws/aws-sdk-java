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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a policy used by Lifecycle management that specifies when to transition files into and out of storage
 * classes. For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html">Managing file system storage</a>.
 * </p>
 * <note>
 * <p>
 * When using the <code>put-lifecycle-configuration</code> CLI command or the <code>PutLifecycleConfiguration</code> API
 * action, Amazon EFS requires that each <code>LifecyclePolicy</code> object have only a single transition. This means
 * that in a request body, <code>LifecyclePolicies</code> must be structured as an array of <code>LifecyclePolicy</code>
 * objects, one object for each transition. For more information, see the request examples in
 * <a>PutLifecycleConfiguration</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/LifecyclePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) at which to
     * move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a directory
     * don't count as file access events.
     * </p>
     */
    private String transitionToIA;
    /**
     * <p>
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access events.
     * </p>
     */
    private String transitionToPrimaryStorageClass;
    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) files at which
     * to move them to Archive storage. Metadata operations such as listing the contents of a directory don't count as
     * file access events.
     * </p>
     */
    private String transitionToArchive;

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) at which to
     * move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a directory
     * don't count as file access events.
     * </p>
     * 
     * @param transitionToIA
     *        The number of days after files were last accessed in primary storage (the Standard storage class) at which
     *        to move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a
     *        directory don't count as file access events.
     * @see TransitionToIARules
     */

    public void setTransitionToIA(String transitionToIA) {
        this.transitionToIA = transitionToIA;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) at which to
     * move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a directory
     * don't count as file access events.
     * </p>
     * 
     * @return The number of days after files were last accessed in primary storage (the Standard storage class) at
     *         which to move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of
     *         a directory don't count as file access events.
     * @see TransitionToIARules
     */

    public String getTransitionToIA() {
        return this.transitionToIA;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) at which to
     * move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a directory
     * don't count as file access events.
     * </p>
     * 
     * @param transitionToIA
     *        The number of days after files were last accessed in primary storage (the Standard storage class) at which
     *        to move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a
     *        directory don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToIARules
     */

    public LifecyclePolicy withTransitionToIA(String transitionToIA) {
        setTransitionToIA(transitionToIA);
        return this;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) at which to
     * move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a directory
     * don't count as file access events.
     * </p>
     * 
     * @param transitionToIA
     *        The number of days after files were last accessed in primary storage (the Standard storage class) at which
     *        to move them to Infrequent Access (IA) storage. Metadata operations such as listing the contents of a
     *        directory don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToIARules
     */

    public LifecyclePolicy withTransitionToIA(TransitionToIARules transitionToIA) {
        this.transitionToIA = transitionToIA.toString();
        return this;
    }

    /**
     * <p>
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access events.
     * </p>
     * 
     * @param transitionToPrimaryStorageClass
     *        Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     *        Metadata operations such as listing the contents of a directory don't count as file access events.
     * @see TransitionToPrimaryStorageClassRules
     */

    public void setTransitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    /**
     * <p>
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access events.
     * </p>
     * 
     * @return Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive
     *         storage. Metadata operations such as listing the contents of a directory don't count as file access
     *         events.
     * @see TransitionToPrimaryStorageClassRules
     */

    public String getTransitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass;
    }

    /**
     * <p>
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access events.
     * </p>
     * 
     * @param transitionToPrimaryStorageClass
     *        Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     *        Metadata operations such as listing the contents of a directory don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToPrimaryStorageClassRules
     */

    public LifecyclePolicy withTransitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
        setTransitionToPrimaryStorageClass(transitionToPrimaryStorageClass);
        return this;
    }

    /**
     * <p>
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access events.
     * </p>
     * 
     * @param transitionToPrimaryStorageClass
     *        Whether to move files back to primary (Standard) storage after they are accessed in IA or Archive storage.
     *        Metadata operations such as listing the contents of a directory don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToPrimaryStorageClassRules
     */

    public LifecyclePolicy withTransitionToPrimaryStorageClass(TransitionToPrimaryStorageClassRules transitionToPrimaryStorageClass) {
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass.toString();
        return this;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) files at which
     * to move them to Archive storage. Metadata operations such as listing the contents of a directory don't count as
     * file access events.
     * </p>
     * 
     * @param transitionToArchive
     *        The number of days after files were last accessed in primary storage (the Standard storage class) files at
     *        which to move them to Archive storage. Metadata operations such as listing the contents of a directory
     *        don't count as file access events.
     * @see TransitionToArchiveRules
     */

    public void setTransitionToArchive(String transitionToArchive) {
        this.transitionToArchive = transitionToArchive;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) files at which
     * to move them to Archive storage. Metadata operations such as listing the contents of a directory don't count as
     * file access events.
     * </p>
     * 
     * @return The number of days after files were last accessed in primary storage (the Standard storage class) files
     *         at which to move them to Archive storage. Metadata operations such as listing the contents of a directory
     *         don't count as file access events.
     * @see TransitionToArchiveRules
     */

    public String getTransitionToArchive() {
        return this.transitionToArchive;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) files at which
     * to move them to Archive storage. Metadata operations such as listing the contents of a directory don't count as
     * file access events.
     * </p>
     * 
     * @param transitionToArchive
     *        The number of days after files were last accessed in primary storage (the Standard storage class) files at
     *        which to move them to Archive storage. Metadata operations such as listing the contents of a directory
     *        don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToArchiveRules
     */

    public LifecyclePolicy withTransitionToArchive(String transitionToArchive) {
        setTransitionToArchive(transitionToArchive);
        return this;
    }

    /**
     * <p>
     * The number of days after files were last accessed in primary storage (the Standard storage class) files at which
     * to move them to Archive storage. Metadata operations such as listing the contents of a directory don't count as
     * file access events.
     * </p>
     * 
     * @param transitionToArchive
     *        The number of days after files were last accessed in primary storage (the Standard storage class) files at
     *        which to move them to Archive storage. Metadata operations such as listing the contents of a directory
     *        don't count as file access events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionToArchiveRules
     */

    public LifecyclePolicy withTransitionToArchive(TransitionToArchiveRules transitionToArchive) {
        this.transitionToArchive = transitionToArchive.toString();
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
        if (getTransitionToIA() != null)
            sb.append("TransitionToIA: ").append(getTransitionToIA()).append(",");
        if (getTransitionToPrimaryStorageClass() != null)
            sb.append("TransitionToPrimaryStorageClass: ").append(getTransitionToPrimaryStorageClass()).append(",");
        if (getTransitionToArchive() != null)
            sb.append("TransitionToArchive: ").append(getTransitionToArchive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicy == false)
            return false;
        LifecyclePolicy other = (LifecyclePolicy) obj;
        if (other.getTransitionToIA() == null ^ this.getTransitionToIA() == null)
            return false;
        if (other.getTransitionToIA() != null && other.getTransitionToIA().equals(this.getTransitionToIA()) == false)
            return false;
        if (other.getTransitionToPrimaryStorageClass() == null ^ this.getTransitionToPrimaryStorageClass() == null)
            return false;
        if (other.getTransitionToPrimaryStorageClass() != null
                && other.getTransitionToPrimaryStorageClass().equals(this.getTransitionToPrimaryStorageClass()) == false)
            return false;
        if (other.getTransitionToArchive() == null ^ this.getTransitionToArchive() == null)
            return false;
        if (other.getTransitionToArchive() != null && other.getTransitionToArchive().equals(this.getTransitionToArchive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitionToIA() == null) ? 0 : getTransitionToIA().hashCode());
        hashCode = prime * hashCode + ((getTransitionToPrimaryStorageClass() == null) ? 0 : getTransitionToPrimaryStorageClass().hashCode());
        hashCode = prime * hashCode + ((getTransitionToArchive() == null) ? 0 : getTransitionToArchive().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicy clone() {
        try {
            return (LifecyclePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.LifecyclePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
