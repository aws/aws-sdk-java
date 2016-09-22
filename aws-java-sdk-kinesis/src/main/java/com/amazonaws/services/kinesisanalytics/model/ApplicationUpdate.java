/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes updates to apply to an existing Kinesis Analytics application.
 * </p>
 */
public class ApplicationUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Describes application input configuration updates.
     * </p>
     */
    private java.util.List<InputUpdate> inputUpdates;
    /**
     * <p>
     * Describes application code updates.
     * </p>
     */
    private String applicationCodeUpdate;
    /**
     * <p>
     * Describes application output configuration updates.
     * </p>
     */
    private java.util.List<OutputUpdate> outputUpdates;
    /**
     * <p>
     * Describes application reference data source updates.
     * </p>
     */
    private java.util.List<ReferenceDataSourceUpdate> referenceDataSourceUpdates;

    /**
     * <p>
     * Describes application input configuration updates.
     * </p>
     * 
     * @return Describes application input configuration updates.
     */

    public java.util.List<InputUpdate> getInputUpdates() {
        return inputUpdates;
    }

    /**
     * <p>
     * Describes application input configuration updates.
     * </p>
     * 
     * @param inputUpdates
     *        Describes application input configuration updates.
     */

    public void setInputUpdates(java.util.Collection<InputUpdate> inputUpdates) {
        if (inputUpdates == null) {
            this.inputUpdates = null;
            return;
        }

        this.inputUpdates = new java.util.ArrayList<InputUpdate>(inputUpdates);
    }

    /**
     * <p>
     * Describes application input configuration updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputUpdates(java.util.Collection)} or {@link #withInputUpdates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputUpdates
     *        Describes application input configuration updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withInputUpdates(InputUpdate... inputUpdates) {
        if (this.inputUpdates == null) {
            setInputUpdates(new java.util.ArrayList<InputUpdate>(inputUpdates.length));
        }
        for (InputUpdate ele : inputUpdates) {
            this.inputUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes application input configuration updates.
     * </p>
     * 
     * @param inputUpdates
     *        Describes application input configuration updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withInputUpdates(java.util.Collection<InputUpdate> inputUpdates) {
        setInputUpdates(inputUpdates);
        return this;
    }

    /**
     * <p>
     * Describes application code updates.
     * </p>
     * 
     * @param applicationCodeUpdate
     *        Describes application code updates.
     */

    public void setApplicationCodeUpdate(String applicationCodeUpdate) {
        this.applicationCodeUpdate = applicationCodeUpdate;
    }

    /**
     * <p>
     * Describes application code updates.
     * </p>
     * 
     * @return Describes application code updates.
     */

    public String getApplicationCodeUpdate() {
        return this.applicationCodeUpdate;
    }

    /**
     * <p>
     * Describes application code updates.
     * </p>
     * 
     * @param applicationCodeUpdate
     *        Describes application code updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withApplicationCodeUpdate(String applicationCodeUpdate) {
        setApplicationCodeUpdate(applicationCodeUpdate);
        return this;
    }

    /**
     * <p>
     * Describes application output configuration updates.
     * </p>
     * 
     * @return Describes application output configuration updates.
     */

    public java.util.List<OutputUpdate> getOutputUpdates() {
        return outputUpdates;
    }

    /**
     * <p>
     * Describes application output configuration updates.
     * </p>
     * 
     * @param outputUpdates
     *        Describes application output configuration updates.
     */

    public void setOutputUpdates(java.util.Collection<OutputUpdate> outputUpdates) {
        if (outputUpdates == null) {
            this.outputUpdates = null;
            return;
        }

        this.outputUpdates = new java.util.ArrayList<OutputUpdate>(outputUpdates);
    }

    /**
     * <p>
     * Describes application output configuration updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputUpdates(java.util.Collection)} or {@link #withOutputUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputUpdates
     *        Describes application output configuration updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withOutputUpdates(OutputUpdate... outputUpdates) {
        if (this.outputUpdates == null) {
            setOutputUpdates(new java.util.ArrayList<OutputUpdate>(outputUpdates.length));
        }
        for (OutputUpdate ele : outputUpdates) {
            this.outputUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes application output configuration updates.
     * </p>
     * 
     * @param outputUpdates
     *        Describes application output configuration updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withOutputUpdates(java.util.Collection<OutputUpdate> outputUpdates) {
        setOutputUpdates(outputUpdates);
        return this;
    }

    /**
     * <p>
     * Describes application reference data source updates.
     * </p>
     * 
     * @return Describes application reference data source updates.
     */

    public java.util.List<ReferenceDataSourceUpdate> getReferenceDataSourceUpdates() {
        return referenceDataSourceUpdates;
    }

    /**
     * <p>
     * Describes application reference data source updates.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        Describes application reference data source updates.
     */

    public void setReferenceDataSourceUpdates(java.util.Collection<ReferenceDataSourceUpdate> referenceDataSourceUpdates) {
        if (referenceDataSourceUpdates == null) {
            this.referenceDataSourceUpdates = null;
            return;
        }

        this.referenceDataSourceUpdates = new java.util.ArrayList<ReferenceDataSourceUpdate>(referenceDataSourceUpdates);
    }

    /**
     * <p>
     * Describes application reference data source updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSourceUpdates(java.util.Collection)} or
     * {@link #withReferenceDataSourceUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        Describes application reference data source updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withReferenceDataSourceUpdates(ReferenceDataSourceUpdate... referenceDataSourceUpdates) {
        if (this.referenceDataSourceUpdates == null) {
            setReferenceDataSourceUpdates(new java.util.ArrayList<ReferenceDataSourceUpdate>(referenceDataSourceUpdates.length));
        }
        for (ReferenceDataSourceUpdate ele : referenceDataSourceUpdates) {
            this.referenceDataSourceUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes application reference data source updates.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        Describes application reference data source updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationUpdate withReferenceDataSourceUpdates(java.util.Collection<ReferenceDataSourceUpdate> referenceDataSourceUpdates) {
        setReferenceDataSourceUpdates(referenceDataSourceUpdates);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInputUpdates() != null)
            sb.append("InputUpdates: " + getInputUpdates() + ",");
        if (getApplicationCodeUpdate() != null)
            sb.append("ApplicationCodeUpdate: " + getApplicationCodeUpdate() + ",");
        if (getOutputUpdates() != null)
            sb.append("OutputUpdates: " + getOutputUpdates() + ",");
        if (getReferenceDataSourceUpdates() != null)
            sb.append("ReferenceDataSourceUpdates: " + getReferenceDataSourceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationUpdate == false)
            return false;
        ApplicationUpdate other = (ApplicationUpdate) obj;
        if (other.getInputUpdates() == null ^ this.getInputUpdates() == null)
            return false;
        if (other.getInputUpdates() != null && other.getInputUpdates().equals(this.getInputUpdates()) == false)
            return false;
        if (other.getApplicationCodeUpdate() == null ^ this.getApplicationCodeUpdate() == null)
            return false;
        if (other.getApplicationCodeUpdate() != null && other.getApplicationCodeUpdate().equals(this.getApplicationCodeUpdate()) == false)
            return false;
        if (other.getOutputUpdates() == null ^ this.getOutputUpdates() == null)
            return false;
        if (other.getOutputUpdates() != null && other.getOutputUpdates().equals(this.getOutputUpdates()) == false)
            return false;
        if (other.getReferenceDataSourceUpdates() == null ^ this.getReferenceDataSourceUpdates() == null)
            return false;
        if (other.getReferenceDataSourceUpdates() != null && other.getReferenceDataSourceUpdates().equals(this.getReferenceDataSourceUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputUpdates() == null) ? 0 : getInputUpdates().hashCode());
        hashCode = prime * hashCode + ((getApplicationCodeUpdate() == null) ? 0 : getApplicationCodeUpdate().hashCode());
        hashCode = prime * hashCode + ((getOutputUpdates() == null) ? 0 : getOutputUpdates().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSourceUpdates() == null) ? 0 : getReferenceDataSourceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationUpdate clone() {
        try {
            return (ApplicationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
