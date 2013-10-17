/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * The status of an option, including when it was last updated and whether it is actively in use for searches.
 * </p>
 */
public class OptionStatus implements Serializable {

    /**
     * A timestamp for when this option was created.
     */
    private java.util.Date creationDate;

    /**
     * A timestamp for when this option was last updated.
     */
    private java.util.Date updateDate;

    /**
     * A unique integer that indicates when this option was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer updateVersion;

    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     */
    private String state;

    /**
     * Indicates that the option will be deleted once processing is complete.
     */
    private Boolean pendingDeletion;

    /**
     * A timestamp for when this option was created.
     *
     * @return A timestamp for when this option was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * A timestamp for when this option was created.
     *
     * @param creationDate A timestamp for when this option was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * A timestamp for when this option was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate A timestamp for when this option was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionStatus withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * A timestamp for when this option was last updated.
     *
     * @return A timestamp for when this option was last updated.
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }
    
    /**
     * A timestamp for when this option was last updated.
     *
     * @param updateDate A timestamp for when this option was last updated.
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }
    
    /**
     * A timestamp for when this option was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param updateDate A timestamp for when this option was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionStatus withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * A unique integer that indicates when this option was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A unique integer that indicates when this option was last updated.
     */
    public Integer getUpdateVersion() {
        return updateVersion;
    }
    
    /**
     * A unique integer that indicates when this option was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param updateVersion A unique integer that indicates when this option was last updated.
     */
    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }
    
    /**
     * A unique integer that indicates when this option was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param updateVersion A unique integer that indicates when this option was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionStatus withUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
        return this;
    }

    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @return The state of processing a change to an option. Possible values:<ul>
     *         <li><code>RequiresIndexDocuments</code>: the option's latest value
     *         will not be visible in searches until <a>IndexDocuments</a> has been
     *         called and indexing is complete.</li> <li><code>Processing</code>: the
     *         option's latest value is not yet visible in all searches but is in the
     *         process of being activated. </li> <li><code>Active</code>: the
     *         option's latest value is completely visible. Any warnings or messages
     *         generated during processing are provided in
     *         <code>Diagnostics</code>.</li> </ul>
     *
     * @see OptionState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state The state of processing a change to an option. Possible values:<ul>
     *         <li><code>RequiresIndexDocuments</code>: the option's latest value
     *         will not be visible in searches until <a>IndexDocuments</a> has been
     *         called and indexing is complete.</li> <li><code>Processing</code>: the
     *         option's latest value is not yet visible in all searches but is in the
     *         process of being activated. </li> <li><code>Active</code>: the
     *         option's latest value is completely visible. Any warnings or messages
     *         generated during processing are provided in
     *         <code>Diagnostics</code>.</li> </ul>
     *
     * @see OptionState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state The state of processing a change to an option. Possible values:<ul>
     *         <li><code>RequiresIndexDocuments</code>: the option's latest value
     *         will not be visible in searches until <a>IndexDocuments</a> has been
     *         called and indexing is complete.</li> <li><code>Processing</code>: the
     *         option's latest value is not yet visible in all searches but is in the
     *         process of being activated. </li> <li><code>Active</code>: the
     *         option's latest value is completely visible. Any warnings or messages
     *         generated during processing are provided in
     *         <code>Diagnostics</code>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OptionState
     */
    public OptionStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state The state of processing a change to an option. Possible values:<ul>
     *         <li><code>RequiresIndexDocuments</code>: the option's latest value
     *         will not be visible in searches until <a>IndexDocuments</a> has been
     *         called and indexing is complete.</li> <li><code>Processing</code>: the
     *         option's latest value is not yet visible in all searches but is in the
     *         process of being activated. </li> <li><code>Active</code>: the
     *         option's latest value is completely visible. Any warnings or messages
     *         generated during processing are provided in
     *         <code>Diagnostics</code>.</li> </ul>
     *
     * @see OptionState
     */
    public void setState(OptionState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of processing a change to an option. Possible values:<ul>
     * <li><code>RequiresIndexDocuments</code>: the option's latest value
     * will not be visible in searches until <a>IndexDocuments</a> has been
     * called and indexing is complete.</li> <li><code>Processing</code>: the
     * option's latest value is not yet visible in all searches but is in the
     * process of being activated. </li> <li><code>Active</code>: the
     * option's latest value is completely visible. Any warnings or messages
     * generated during processing are provided in
     * <code>Diagnostics</code>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequiresIndexDocuments, Processing, Active
     *
     * @param state The state of processing a change to an option. Possible values:<ul>
     *         <li><code>RequiresIndexDocuments</code>: the option's latest value
     *         will not be visible in searches until <a>IndexDocuments</a> has been
     *         called and indexing is complete.</li> <li><code>Processing</code>: the
     *         option's latest value is not yet visible in all searches but is in the
     *         process of being activated. </li> <li><code>Active</code>: the
     *         option's latest value is completely visible. Any warnings or messages
     *         generated during processing are provided in
     *         <code>Diagnostics</code>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OptionState
     */
    public OptionStatus withState(OptionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Indicates that the option will be deleted once processing is complete.
     *
     * @return Indicates that the option will be deleted once processing is complete.
     */
    public Boolean isPendingDeletion() {
        return pendingDeletion;
    }
    
    /**
     * Indicates that the option will be deleted once processing is complete.
     *
     * @param pendingDeletion Indicates that the option will be deleted once processing is complete.
     */
    public void setPendingDeletion(Boolean pendingDeletion) {
        this.pendingDeletion = pendingDeletion;
    }
    
    /**
     * Indicates that the option will be deleted once processing is complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingDeletion Indicates that the option will be deleted once processing is complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionStatus withPendingDeletion(Boolean pendingDeletion) {
        this.pendingDeletion = pendingDeletion;
        return this;
    }

    /**
     * Indicates that the option will be deleted once processing is complete.
     *
     * @return Indicates that the option will be deleted once processing is complete.
     */
    public Boolean getPendingDeletion() {
        return pendingDeletion;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getUpdateDate() != null) sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getUpdateVersion() != null) sb.append("UpdateVersion: " + getUpdateVersion() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (isPendingDeletion() != null) sb.append("PendingDeletion: " + isPendingDeletion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((isPendingDeletion() == null) ? 0 : isPendingDeletion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionStatus == false) return false;
        OptionStatus other = (OptionStatus)obj;
        
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null) return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false) return false; 
        if (other.getUpdateVersion() == null ^ this.getUpdateVersion() == null) return false;
        if (other.getUpdateVersion() != null && other.getUpdateVersion().equals(this.getUpdateVersion()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.isPendingDeletion() == null ^ this.isPendingDeletion() == null) return false;
        if (other.isPendingDeletion() != null && other.isPendingDeletion().equals(this.isPendingDeletion()) == false) return false; 
        return true;
    }
    
}
    