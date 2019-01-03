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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotebookInstanceLifecycleConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     */
    private String notebookInstanceLifecycleConfigName;
    /**
     * <p>
     * A shell script that runs only once, when you create a notebook instance. The shell script must be a
     * base64-encoded string.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleHook> onCreate;
    /**
     * <p>
     * A shell script that runs every time you start a notebook instance, including when you create the notebook
     * instance. The shell script must be a base64-encoded string.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleHook> onStart;

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of the lifecycle configuration.
     */

    public void setNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        this.notebookInstanceLifecycleConfigName = notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @return The name of the lifecycle configuration.
     */

    public String getNotebookInstanceLifecycleConfigName() {
        return this.notebookInstanceLifecycleConfigName;
    }

    /**
     * <p>
     * The name of the lifecycle configuration.
     * </p>
     * 
     * @param notebookInstanceLifecycleConfigName
     *        The name of the lifecycle configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigRequest withNotebookInstanceLifecycleConfigName(String notebookInstanceLifecycleConfigName) {
        setNotebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * A shell script that runs only once, when you create a notebook instance. The shell script must be a
     * base64-encoded string.
     * </p>
     * 
     * @return A shell script that runs only once, when you create a notebook instance. The shell script must be a
     *         base64-encoded string.
     */

    public java.util.List<NotebookInstanceLifecycleHook> getOnCreate() {
        return onCreate;
    }

    /**
     * <p>
     * A shell script that runs only once, when you create a notebook instance. The shell script must be a
     * base64-encoded string.
     * </p>
     * 
     * @param onCreate
     *        A shell script that runs only once, when you create a notebook instance. The shell script must be a
     *        base64-encoded string.
     */

    public void setOnCreate(java.util.Collection<NotebookInstanceLifecycleHook> onCreate) {
        if (onCreate == null) {
            this.onCreate = null;
            return;
        }

        this.onCreate = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onCreate);
    }

    /**
     * <p>
     * A shell script that runs only once, when you create a notebook instance. The shell script must be a
     * base64-encoded string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnCreate(java.util.Collection)} or {@link #withOnCreate(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param onCreate
     *        A shell script that runs only once, when you create a notebook instance. The shell script must be a
     *        base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigRequest withOnCreate(NotebookInstanceLifecycleHook... onCreate) {
        if (this.onCreate == null) {
            setOnCreate(new java.util.ArrayList<NotebookInstanceLifecycleHook>(onCreate.length));
        }
        for (NotebookInstanceLifecycleHook ele : onCreate) {
            this.onCreate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A shell script that runs only once, when you create a notebook instance. The shell script must be a
     * base64-encoded string.
     * </p>
     * 
     * @param onCreate
     *        A shell script that runs only once, when you create a notebook instance. The shell script must be a
     *        base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigRequest withOnCreate(java.util.Collection<NotebookInstanceLifecycleHook> onCreate) {
        setOnCreate(onCreate);
        return this;
    }

    /**
     * <p>
     * A shell script that runs every time you start a notebook instance, including when you create the notebook
     * instance. The shell script must be a base64-encoded string.
     * </p>
     * 
     * @return A shell script that runs every time you start a notebook instance, including when you create the notebook
     *         instance. The shell script must be a base64-encoded string.
     */

    public java.util.List<NotebookInstanceLifecycleHook> getOnStart() {
        return onStart;
    }

    /**
     * <p>
     * A shell script that runs every time you start a notebook instance, including when you create the notebook
     * instance. The shell script must be a base64-encoded string.
     * </p>
     * 
     * @param onStart
     *        A shell script that runs every time you start a notebook instance, including when you create the notebook
     *        instance. The shell script must be a base64-encoded string.
     */

    public void setOnStart(java.util.Collection<NotebookInstanceLifecycleHook> onStart) {
        if (onStart == null) {
            this.onStart = null;
            return;
        }

        this.onStart = new java.util.ArrayList<NotebookInstanceLifecycleHook>(onStart);
    }

    /**
     * <p>
     * A shell script that runs every time you start a notebook instance, including when you create the notebook
     * instance. The shell script must be a base64-encoded string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnStart(java.util.Collection)} or {@link #withOnStart(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param onStart
     *        A shell script that runs every time you start a notebook instance, including when you create the notebook
     *        instance. The shell script must be a base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigRequest withOnStart(NotebookInstanceLifecycleHook... onStart) {
        if (this.onStart == null) {
            setOnStart(new java.util.ArrayList<NotebookInstanceLifecycleHook>(onStart.length));
        }
        for (NotebookInstanceLifecycleHook ele : onStart) {
            this.onStart.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A shell script that runs every time you start a notebook instance, including when you create the notebook
     * instance. The shell script must be a base64-encoded string.
     * </p>
     * 
     * @param onStart
     *        A shell script that runs every time you start a notebook instance, including when you create the notebook
     *        instance. The shell script must be a base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotebookInstanceLifecycleConfigRequest withOnStart(java.util.Collection<NotebookInstanceLifecycleHook> onStart) {
        setOnStart(onStart);
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
        if (getNotebookInstanceLifecycleConfigName() != null)
            sb.append("NotebookInstanceLifecycleConfigName: ").append(getNotebookInstanceLifecycleConfigName()).append(",");
        if (getOnCreate() != null)
            sb.append("OnCreate: ").append(getOnCreate()).append(",");
        if (getOnStart() != null)
            sb.append("OnStart: ").append(getOnStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotebookInstanceLifecycleConfigRequest == false)
            return false;
        CreateNotebookInstanceLifecycleConfigRequest other = (CreateNotebookInstanceLifecycleConfigRequest) obj;
        if (other.getNotebookInstanceLifecycleConfigName() == null ^ this.getNotebookInstanceLifecycleConfigName() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigName() != null
                && other.getNotebookInstanceLifecycleConfigName().equals(this.getNotebookInstanceLifecycleConfigName()) == false)
            return false;
        if (other.getOnCreate() == null ^ this.getOnCreate() == null)
            return false;
        if (other.getOnCreate() != null && other.getOnCreate().equals(this.getOnCreate()) == false)
            return false;
        if (other.getOnStart() == null ^ this.getOnStart() == null)
            return false;
        if (other.getOnStart() != null && other.getOnStart().equals(this.getOnStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceLifecycleConfigName() == null) ? 0 : getNotebookInstanceLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getOnCreate() == null) ? 0 : getOnCreate().hashCode());
        hashCode = prime * hashCode + ((getOnStart() == null) ? 0 : getOnStart().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotebookInstanceLifecycleConfigRequest clone() {
        return (CreateNotebookInstanceLifecycleConfigRequest) super.clone();
    }

}
