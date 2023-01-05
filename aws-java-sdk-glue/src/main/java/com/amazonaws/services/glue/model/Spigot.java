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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a transform that writes samples of the data to an Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Spigot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Spigot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in an
     * Amazon S3 bucket.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Specifies a number of records to write starting from the beginning of the dataset.
     * </p>
     */
    private Integer topk;
    /**
     * <p>
     * The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1 indicates
     * that each row read from the dataset should be included in the sample output.
     * </p>
     */
    private Double prob;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @return The data inputs identified by their node names.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in an
     * Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in
     *        an Amazon S3 bucket.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in an
     * Amazon S3 bucket.
     * </p>
     * 
     * @return A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in
     *         an Amazon S3 bucket.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in an
     * Amazon S3 bucket.
     * </p>
     * 
     * @param path
     *        A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in
     *        an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Specifies a number of records to write starting from the beginning of the dataset.
     * </p>
     * 
     * @param topk
     *        Specifies a number of records to write starting from the beginning of the dataset.
     */

    public void setTopk(Integer topk) {
        this.topk = topk;
    }

    /**
     * <p>
     * Specifies a number of records to write starting from the beginning of the dataset.
     * </p>
     * 
     * @return Specifies a number of records to write starting from the beginning of the dataset.
     */

    public Integer getTopk() {
        return this.topk;
    }

    /**
     * <p>
     * Specifies a number of records to write starting from the beginning of the dataset.
     * </p>
     * 
     * @param topk
     *        Specifies a number of records to write starting from the beginning of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withTopk(Integer topk) {
        setTopk(topk);
        return this;
    }

    /**
     * <p>
     * The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1 indicates
     * that each row read from the dataset should be included in the sample output.
     * </p>
     * 
     * @param prob
     *        The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1
     *        indicates that each row read from the dataset should be included in the sample output.
     */

    public void setProb(Double prob) {
        this.prob = prob;
    }

    /**
     * <p>
     * The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1 indicates
     * that each row read from the dataset should be included in the sample output.
     * </p>
     * 
     * @return The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1
     *         indicates that each row read from the dataset should be included in the sample output.
     */

    public Double getProb() {
        return this.prob;
    }

    /**
     * <p>
     * The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1 indicates
     * that each row read from the dataset should be included in the sample output.
     * </p>
     * 
     * @param prob
     *        The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1
     *        indicates that each row read from the dataset should be included in the sample output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spigot withProb(Double prob) {
        setProb(prob);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getTopk() != null)
            sb.append("Topk: ").append(getTopk()).append(",");
        if (getProb() != null)
            sb.append("Prob: ").append(getProb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Spigot == false)
            return false;
        Spigot other = (Spigot) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getTopk() == null ^ this.getTopk() == null)
            return false;
        if (other.getTopk() != null && other.getTopk().equals(this.getTopk()) == false)
            return false;
        if (other.getProb() == null ^ this.getProb() == null)
            return false;
        if (other.getProb() != null && other.getProb().equals(this.getProb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getTopk() == null) ? 0 : getTopk().hashCode());
        hashCode = prime * hashCode + ((getProb() == null) ? 0 : getProb().hashCode());
        return hashCode;
    }

    @Override
    public Spigot clone() {
        try {
            return (Spigot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SpigotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
