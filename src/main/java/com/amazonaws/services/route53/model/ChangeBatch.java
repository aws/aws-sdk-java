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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains an optional comment and the changes that you want to make with a change batch request.
 * </p>
 */
public class ChangeBatch implements Serializable {

    /**
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String comment;

    /**
     * A complex type that contains one <code>Change</code> element for each
     * resource record set that you want to create or delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Change> changes;

    /**
     * Default constructor for a new ChangeBatch object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeBatch() {}
    
    /**
     * Constructs a new ChangeBatch object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param changes A complex type that contains one <code>Change</code>
     * element for each resource record set that you want to create or
     * delete.
     */
    public ChangeBatch(java.util.List<Change> changes) {
        setChanges(changes);
    }

    /**
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <i>Optional:</i> Any comments you want to include about a change batch
     *         request.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment <i>Optional:</i> Any comments you want to include about a change batch
     *         request.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment <i>Optional:</i> Any comments you want to include about a change batch
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeBatch withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * A complex type that contains one <code>Change</code> element for each
     * resource record set that you want to create or delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A complex type that contains one <code>Change</code> element for each
     *         resource record set that you want to create or delete.
     */
    public java.util.List<Change> getChanges() {
        if (changes == null) {
              changes = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>();
              changes.setAutoConstruct(true);
        }
        return changes;
    }
    
    /**
     * A complex type that contains one <code>Change</code> element for each
     * resource record set that you want to create or delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A complex type that contains one <code>Change</code> element for each
     *         resource record set that you want to create or delete.
     */
    public void setChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Change> changesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>(changes.size());
        changesCopy.addAll(changes);
        this.changes = changesCopy;
    }
    
    /**
     * A complex type that contains one <code>Change</code> element for each
     * resource record set that you want to create or delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A complex type that contains one <code>Change</code> element for each
     *         resource record set that you want to create or delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeBatch withChanges(Change... changes) {
        if (getChanges() == null) setChanges(new java.util.ArrayList<Change>(changes.length));
        for (Change value : changes) {
            getChanges().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains one <code>Change</code> element for each
     * resource record set that you want to create or delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param changes A complex type that contains one <code>Change</code> element for each
     *         resource record set that you want to create or delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeBatch withChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Change> changesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Change>(changes.size());
            changesCopy.addAll(changes);
            this.changes = changesCopy;
        }

        return this;
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
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getChanges() != null) sb.append("Changes: " + getChanges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeBatch == false) return false;
        ChangeBatch other = (ChangeBatch)obj;
        
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getChanges() == null ^ this.getChanges() == null) return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false) return false; 
        return true;
    }
    
}
    