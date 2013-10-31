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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * An application is any Amazon or third-party software that you can add to the cluster. This structure contains a list of strings that indicates the
 * software to use with the cluster and accepts a user argument list. Amazon EMR accepts and forwards the argument list to the corresponding installation
 * script as bootstrap action argument. For more information, see <a
 * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html"> Launch a Job Flow on the MapR Distribution for Hadoop </a> .
 * Currently supported values are:
 * </p>
 * 
 * <ul>
 * <li>"karmasphere-enterprise-utility" - tag the job flow for management by <a href="http://aws.amazon.com/elasticmapreduce/karmasphere/"> Karmasphere
 * </a> .</li>
 * <li>"mapr-m3" - launch the job flow using MapR M3 Edition.</li>
 * <li>"mapr-m5" - launch the job flow using MapR M5 Edition.</li>
 * <li>"mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition, respectively.</li>
 * 
 * </ul>
 */
public class Application implements Serializable {

    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String name;

    /**
     * The version of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String version;

    /**
     * Arguments for Amazon EMR to pass to the application.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> args;

    /**
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     */
    private java.util.Map<String,String> additionalInfo;

    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The name of the application.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the application.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Application withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The version of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The version of the application.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param version The version of the application.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param version The version of the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Application withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Arguments for Amazon EMR to pass to the application.
     *
     * @return Arguments for Amazon EMR to pass to the application.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
              args = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              args.setAutoConstruct(true);
        }
        return args;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the application.
     *
     * @param args Arguments for Amazon EMR to pass to the application.
     */
    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
        argsCopy.addAll(args);
        this.args = argsCopy;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args Arguments for Amazon EMR to pass to the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Application withArgs(String... args) {
        if (getArgs() == null) setArgs(new java.util.ArrayList<String>(args.length));
        for (String value : args) {
            getArgs().add(value);
        }
        return this;
    }
    
    /**
     * Arguments for Amazon EMR to pass to the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args Arguments for Amazon EMR to pass to the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Application withArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
            argsCopy.addAll(args);
            this.args = argsCopy;
        }

        return this;
    }

    /**
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     *
     * @return This option is for advanced users only. This is meta information about
     *         third-party applications that third-party vendors use for testing
     *         purposes.
     */
    public java.util.Map<String,String> getAdditionalInfo() {
        
        if (additionalInfo == null) {
            additionalInfo = new java.util.HashMap<String,String>();
        }
        return additionalInfo;
    }
    
    /**
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     *
     * @param additionalInfo This option is for advanced users only. This is meta information about
     *         third-party applications that third-party vendors use for testing
     *         purposes.
     */
    public void setAdditionalInfo(java.util.Map<String,String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo This option is for advanced users only. This is meta information about
     *         third-party applications that third-party vendors use for testing
     *         purposes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Application withAdditionalInfo(java.util.Map<String,String> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * This option is for advanced users only. This is meta information about
     * third-party applications that third-party vendors use for testing
     * purposes.
     * <p>
     * The method adds a new key-value pair into AdditionalInfo parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into AdditionalInfo.
     * @param value The corresponding value of the entry to be added into AdditionalInfo.
     */
	public Application addAdditionalInfoEntry(String key, String value) {
		if (null == this.additionalInfo) {
			this.additionalInfo = new java.util.HashMap<String,String>();
		}
		if (this.additionalInfo.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.additionalInfo.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into AdditionalInfo.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public Application clearAdditionalInfoEntries() {
		this.additionalInfo = null;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Application == false) return false;
        Application other = (Application)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        return true;
    }
    
}
    