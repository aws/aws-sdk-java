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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteAwsLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAwsLogSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, java.util.List<String>>> disableAllDimensions;
    /**
     * <p>
     * Removes all Amazon Web Services sources from specific accounts or Regions.
     * </p>
     */
    private java.util.List<String> disableSingleDimension;
    /**
     * <p>
     * Remove a specific Amazon Web Services source from specific accounts or Regions.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> disableTwoDimensions;
    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     */
    private java.util.List<String> inputOrder;

    /**
     * <p>
     * Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     * </p>
     * 
     * @return Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     */

    public java.util.Map<String, java.util.Map<String, java.util.List<String>>> getDisableAllDimensions() {
        return disableAllDimensions;
    }

    /**
     * <p>
     * Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     * </p>
     * 
     * @param disableAllDimensions
     *        Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     */

    public void setDisableAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> disableAllDimensions) {
        this.disableAllDimensions = disableAllDimensions;
    }

    /**
     * <p>
     * Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     * </p>
     * 
     * @param disableAllDimensions
     *        Removes the specific Amazon Web Services sources from specific accounts and specific Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest withDisableAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> disableAllDimensions) {
        setDisableAllDimensions(disableAllDimensions);
        return this;
    }

    /**
     * Add a single DisableAllDimensions entry
     *
     * @see DeleteAwsLogSourceRequest#withDisableAllDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest addDisableAllDimensionsEntry(String key, java.util.Map<String, java.util.List<String>> value) {
        if (null == this.disableAllDimensions) {
            this.disableAllDimensions = new java.util.HashMap<String, java.util.Map<String, java.util.List<String>>>();
        }
        if (this.disableAllDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.disableAllDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DisableAllDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest clearDisableAllDimensionsEntries() {
        this.disableAllDimensions = null;
        return this;
    }

    /**
     * <p>
     * Removes all Amazon Web Services sources from specific accounts or Regions.
     * </p>
     * 
     * @return Removes all Amazon Web Services sources from specific accounts or Regions.
     */

    public java.util.List<String> getDisableSingleDimension() {
        return disableSingleDimension;
    }

    /**
     * <p>
     * Removes all Amazon Web Services sources from specific accounts or Regions.
     * </p>
     * 
     * @param disableSingleDimension
     *        Removes all Amazon Web Services sources from specific accounts or Regions.
     */

    public void setDisableSingleDimension(java.util.Collection<String> disableSingleDimension) {
        if (disableSingleDimension == null) {
            this.disableSingleDimension = null;
            return;
        }

        this.disableSingleDimension = new java.util.ArrayList<String>(disableSingleDimension);
    }

    /**
     * <p>
     * Removes all Amazon Web Services sources from specific accounts or Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisableSingleDimension(java.util.Collection)} or
     * {@link #withDisableSingleDimension(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param disableSingleDimension
     *        Removes all Amazon Web Services sources from specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest withDisableSingleDimension(String... disableSingleDimension) {
        if (this.disableSingleDimension == null) {
            setDisableSingleDimension(new java.util.ArrayList<String>(disableSingleDimension.length));
        }
        for (String ele : disableSingleDimension) {
            this.disableSingleDimension.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Removes all Amazon Web Services sources from specific accounts or Regions.
     * </p>
     * 
     * @param disableSingleDimension
     *        Removes all Amazon Web Services sources from specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest withDisableSingleDimension(java.util.Collection<String> disableSingleDimension) {
        setDisableSingleDimension(disableSingleDimension);
        return this;
    }

    /**
     * <p>
     * Remove a specific Amazon Web Services source from specific accounts or Regions.
     * </p>
     * 
     * @return Remove a specific Amazon Web Services source from specific accounts or Regions.
     */

    public java.util.Map<String, java.util.List<String>> getDisableTwoDimensions() {
        return disableTwoDimensions;
    }

    /**
     * <p>
     * Remove a specific Amazon Web Services source from specific accounts or Regions.
     * </p>
     * 
     * @param disableTwoDimensions
     *        Remove a specific Amazon Web Services source from specific accounts or Regions.
     */

    public void setDisableTwoDimensions(java.util.Map<String, java.util.List<String>> disableTwoDimensions) {
        this.disableTwoDimensions = disableTwoDimensions;
    }

    /**
     * <p>
     * Remove a specific Amazon Web Services source from specific accounts or Regions.
     * </p>
     * 
     * @param disableTwoDimensions
     *        Remove a specific Amazon Web Services source from specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest withDisableTwoDimensions(java.util.Map<String, java.util.List<String>> disableTwoDimensions) {
        setDisableTwoDimensions(disableTwoDimensions);
        return this;
    }

    /**
     * Add a single DisableTwoDimensions entry
     *
     * @see DeleteAwsLogSourceRequest#withDisableTwoDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest addDisableTwoDimensionsEntry(String key, java.util.List<String> value) {
        if (null == this.disableTwoDimensions) {
            this.disableTwoDimensions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.disableTwoDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.disableTwoDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DisableTwoDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAwsLogSourceRequest clearDisableTwoDimensionsEntries() {
        this.disableTwoDimensions = null;
        return this;
    }

    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     * 
     * @return This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region
     *         (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services
     *         account).
     * @see Dimension
     */

    public java.util.List<String> getInputOrder() {
        return inputOrder;
    }

    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     * 
     * @param inputOrder
     *        This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region
     *        (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services
     *        account).
     * @see Dimension
     */

    public void setInputOrder(java.util.Collection<String> inputOrder) {
        if (inputOrder == null) {
            this.inputOrder = null;
            return;
        }

        this.inputOrder = new java.util.ArrayList<String>(inputOrder);
    }

    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputOrder(java.util.Collection)} or {@link #withInputOrder(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputOrder
     *        This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region
     *        (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services
     *        account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public DeleteAwsLogSourceRequest withInputOrder(String... inputOrder) {
        if (this.inputOrder == null) {
            setInputOrder(new java.util.ArrayList<String>(inputOrder.length));
        }
        for (String ele : inputOrder) {
            this.inputOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     * 
     * @param inputOrder
     *        This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region
     *        (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services
     *        account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public DeleteAwsLogSourceRequest withInputOrder(java.util.Collection<String> inputOrder) {
        setInputOrder(inputOrder);
        return this;
    }

    /**
     * <p>
     * This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region (Amazon
     * Web Services Region code, source type, and member (account ID of a specific Amazon Web Services account).
     * </p>
     * 
     * @param inputOrder
     *        This is a mandatory input. Specify the input order to disable dimensions in Security Lake, namely Region
     *        (Amazon Web Services Region code, source type, and member (account ID of a specific Amazon Web Services
     *        account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public DeleteAwsLogSourceRequest withInputOrder(Dimension... inputOrder) {
        java.util.ArrayList<String> inputOrderCopy = new java.util.ArrayList<String>(inputOrder.length);
        for (Dimension value : inputOrder) {
            inputOrderCopy.add(value.toString());
        }
        if (getInputOrder() == null) {
            setInputOrder(inputOrderCopy);
        } else {
            getInputOrder().addAll(inputOrderCopy);
        }
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
        if (getDisableAllDimensions() != null)
            sb.append("DisableAllDimensions: ").append(getDisableAllDimensions()).append(",");
        if (getDisableSingleDimension() != null)
            sb.append("DisableSingleDimension: ").append(getDisableSingleDimension()).append(",");
        if (getDisableTwoDimensions() != null)
            sb.append("DisableTwoDimensions: ").append(getDisableTwoDimensions()).append(",");
        if (getInputOrder() != null)
            sb.append("InputOrder: ").append(getInputOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAwsLogSourceRequest == false)
            return false;
        DeleteAwsLogSourceRequest other = (DeleteAwsLogSourceRequest) obj;
        if (other.getDisableAllDimensions() == null ^ this.getDisableAllDimensions() == null)
            return false;
        if (other.getDisableAllDimensions() != null && other.getDisableAllDimensions().equals(this.getDisableAllDimensions()) == false)
            return false;
        if (other.getDisableSingleDimension() == null ^ this.getDisableSingleDimension() == null)
            return false;
        if (other.getDisableSingleDimension() != null && other.getDisableSingleDimension().equals(this.getDisableSingleDimension()) == false)
            return false;
        if (other.getDisableTwoDimensions() == null ^ this.getDisableTwoDimensions() == null)
            return false;
        if (other.getDisableTwoDimensions() != null && other.getDisableTwoDimensions().equals(this.getDisableTwoDimensions()) == false)
            return false;
        if (other.getInputOrder() == null ^ this.getInputOrder() == null)
            return false;
        if (other.getInputOrder() != null && other.getInputOrder().equals(this.getInputOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableAllDimensions() == null) ? 0 : getDisableAllDimensions().hashCode());
        hashCode = prime * hashCode + ((getDisableSingleDimension() == null) ? 0 : getDisableSingleDimension().hashCode());
        hashCode = prime * hashCode + ((getDisableTwoDimensions() == null) ? 0 : getDisableTwoDimensions().hashCode());
        hashCode = prime * hashCode + ((getInputOrder() == null) ? 0 : getInputOrder().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAwsLogSourceRequest clone() {
        return (DeleteAwsLogSourceRequest) super.clone();
    }

}
