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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a time-based instance's auto scaling schedule. The schedule consists of a set of key-value pairs.
 * </p>
 * 
 * <ul>
 * <li>The key is the time period (a UTC hour) and must be an integer from 0 - 23.</li>
 * <li>The value indicates whether the instance should be online or offline for the specified period, and must be set to "on" or "off"</li>
 * 
 * </ul>
 * <p>
 * The default setting for all time periods is off, so you use the following parameters primarily to specify the online periods. You don't have to
 * explicitly specify offline periods unless you want to change an online period to an offline period.
 * </p>
 * <p>
 * The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be off for the remainder of the day.
 * </p>
 * <code> {
 * "12":"on", "13":"on", "14":"on", "15":"on" }
 * </code>
 */
public class WeeklyAutoScalingSchedule implements Serializable {

    /**
     * The schedule for Monday.
     */
    private java.util.Map<String,String> monday;

    /**
     * The schedule for Tuesday.
     */
    private java.util.Map<String,String> tuesday;

    /**
     * The schedule for Wednesday.
     */
    private java.util.Map<String,String> wednesday;

    /**
     * The schedule for Thursday.
     */
    private java.util.Map<String,String> thursday;

    /**
     * The schedule for Friday.
     */
    private java.util.Map<String,String> friday;

    /**
     * The schedule for Saturday.
     */
    private java.util.Map<String,String> saturday;

    /**
     * The schedule for Sunday.
     */
    private java.util.Map<String,String> sunday;

    /**
     * The schedule for Monday.
     *
     * @return The schedule for Monday.
     */
    public java.util.Map<String,String> getMonday() {
        
        if (monday == null) {
            monday = new java.util.HashMap<String,String>();
        }
        return monday;
    }
    
    /**
     * The schedule for Monday.
     *
     * @param monday The schedule for Monday.
     */
    public void setMonday(java.util.Map<String,String> monday) {
        this.monday = monday;
    }
    
    /**
     * The schedule for Monday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monday The schedule for Monday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withMonday(java.util.Map<String,String> monday) {
        setMonday(monday);
        return this;
    }

    /**
     * The schedule for Monday.
     * <p>
     * The method adds a new key-value pair into Monday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Monday.
     * @param value The corresponding value of the entry to be added into Monday.
     */
	public WeeklyAutoScalingSchedule addMondayEntry(String key, String value) {
		if (null == this.monday) {
			this.monday = new java.util.HashMap<String,String>();
		}
		if (this.monday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.monday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Monday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearMondayEntries() {
		this.monday = null;
		return this;
	}
	
    /**
     * The schedule for Tuesday.
     *
     * @return The schedule for Tuesday.
     */
    public java.util.Map<String,String> getTuesday() {
        
        if (tuesday == null) {
            tuesday = new java.util.HashMap<String,String>();
        }
        return tuesday;
    }
    
    /**
     * The schedule for Tuesday.
     *
     * @param tuesday The schedule for Tuesday.
     */
    public void setTuesday(java.util.Map<String,String> tuesday) {
        this.tuesday = tuesday;
    }
    
    /**
     * The schedule for Tuesday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tuesday The schedule for Tuesday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withTuesday(java.util.Map<String,String> tuesday) {
        setTuesday(tuesday);
        return this;
    }

    /**
     * The schedule for Tuesday.
     * <p>
     * The method adds a new key-value pair into Tuesday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Tuesday.
     * @param value The corresponding value of the entry to be added into Tuesday.
     */
	public WeeklyAutoScalingSchedule addTuesdayEntry(String key, String value) {
		if (null == this.tuesday) {
			this.tuesday = new java.util.HashMap<String,String>();
		}
		if (this.tuesday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.tuesday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Tuesday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearTuesdayEntries() {
		this.tuesday = null;
		return this;
	}
	
    /**
     * The schedule for Wednesday.
     *
     * @return The schedule for Wednesday.
     */
    public java.util.Map<String,String> getWednesday() {
        
        if (wednesday == null) {
            wednesday = new java.util.HashMap<String,String>();
        }
        return wednesday;
    }
    
    /**
     * The schedule for Wednesday.
     *
     * @param wednesday The schedule for Wednesday.
     */
    public void setWednesday(java.util.Map<String,String> wednesday) {
        this.wednesday = wednesday;
    }
    
    /**
     * The schedule for Wednesday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param wednesday The schedule for Wednesday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withWednesday(java.util.Map<String,String> wednesday) {
        setWednesday(wednesday);
        return this;
    }

    /**
     * The schedule for Wednesday.
     * <p>
     * The method adds a new key-value pair into Wednesday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Wednesday.
     * @param value The corresponding value of the entry to be added into Wednesday.
     */
	public WeeklyAutoScalingSchedule addWednesdayEntry(String key, String value) {
		if (null == this.wednesday) {
			this.wednesday = new java.util.HashMap<String,String>();
		}
		if (this.wednesday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.wednesday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Wednesday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearWednesdayEntries() {
		this.wednesday = null;
		return this;
	}
	
    /**
     * The schedule for Thursday.
     *
     * @return The schedule for Thursday.
     */
    public java.util.Map<String,String> getThursday() {
        
        if (thursday == null) {
            thursday = new java.util.HashMap<String,String>();
        }
        return thursday;
    }
    
    /**
     * The schedule for Thursday.
     *
     * @param thursday The schedule for Thursday.
     */
    public void setThursday(java.util.Map<String,String> thursday) {
        this.thursday = thursday;
    }
    
    /**
     * The schedule for Thursday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thursday The schedule for Thursday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withThursday(java.util.Map<String,String> thursday) {
        setThursday(thursday);
        return this;
    }

    /**
     * The schedule for Thursday.
     * <p>
     * The method adds a new key-value pair into Thursday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Thursday.
     * @param value The corresponding value of the entry to be added into Thursday.
     */
	public WeeklyAutoScalingSchedule addThursdayEntry(String key, String value) {
		if (null == this.thursday) {
			this.thursday = new java.util.HashMap<String,String>();
		}
		if (this.thursday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.thursday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Thursday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearThursdayEntries() {
		this.thursday = null;
		return this;
	}
	
    /**
     * The schedule for Friday.
     *
     * @return The schedule for Friday.
     */
    public java.util.Map<String,String> getFriday() {
        
        if (friday == null) {
            friday = new java.util.HashMap<String,String>();
        }
        return friday;
    }
    
    /**
     * The schedule for Friday.
     *
     * @param friday The schedule for Friday.
     */
    public void setFriday(java.util.Map<String,String> friday) {
        this.friday = friday;
    }
    
    /**
     * The schedule for Friday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param friday The schedule for Friday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withFriday(java.util.Map<String,String> friday) {
        setFriday(friday);
        return this;
    }

    /**
     * The schedule for Friday.
     * <p>
     * The method adds a new key-value pair into Friday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Friday.
     * @param value The corresponding value of the entry to be added into Friday.
     */
	public WeeklyAutoScalingSchedule addFridayEntry(String key, String value) {
		if (null == this.friday) {
			this.friday = new java.util.HashMap<String,String>();
		}
		if (this.friday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.friday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Friday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearFridayEntries() {
		this.friday = null;
		return this;
	}
	
    /**
     * The schedule for Saturday.
     *
     * @return The schedule for Saturday.
     */
    public java.util.Map<String,String> getSaturday() {
        
        if (saturday == null) {
            saturday = new java.util.HashMap<String,String>();
        }
        return saturday;
    }
    
    /**
     * The schedule for Saturday.
     *
     * @param saturday The schedule for Saturday.
     */
    public void setSaturday(java.util.Map<String,String> saturday) {
        this.saturday = saturday;
    }
    
    /**
     * The schedule for Saturday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param saturday The schedule for Saturday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withSaturday(java.util.Map<String,String> saturday) {
        setSaturday(saturday);
        return this;
    }

    /**
     * The schedule for Saturday.
     * <p>
     * The method adds a new key-value pair into Saturday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Saturday.
     * @param value The corresponding value of the entry to be added into Saturday.
     */
	public WeeklyAutoScalingSchedule addSaturdayEntry(String key, String value) {
		if (null == this.saturday) {
			this.saturday = new java.util.HashMap<String,String>();
		}
		if (this.saturday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.saturday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Saturday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearSaturdayEntries() {
		this.saturday = null;
		return this;
	}
	
    /**
     * The schedule for Sunday.
     *
     * @return The schedule for Sunday.
     */
    public java.util.Map<String,String> getSunday() {
        
        if (sunday == null) {
            sunday = new java.util.HashMap<String,String>();
        }
        return sunday;
    }
    
    /**
     * The schedule for Sunday.
     *
     * @param sunday The schedule for Sunday.
     */
    public void setSunday(java.util.Map<String,String> sunday) {
        this.sunday = sunday;
    }
    
    /**
     * The schedule for Sunday.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sunday The schedule for Sunday.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WeeklyAutoScalingSchedule withSunday(java.util.Map<String,String> sunday) {
        setSunday(sunday);
        return this;
    }

    /**
     * The schedule for Sunday.
     * <p>
     * The method adds a new key-value pair into Sunday parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Sunday.
     * @param value The corresponding value of the entry to be added into Sunday.
     */
	public WeeklyAutoScalingSchedule addSundayEntry(String key, String value) {
		if (null == this.sunday) {
			this.sunday = new java.util.HashMap<String,String>();
		}
		if (this.sunday.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.sunday.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Sunday.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public WeeklyAutoScalingSchedule clearSundayEntries() {
		this.sunday = null;
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
        if (getMonday() != null) sb.append("Monday: " + getMonday() + ",");
        if (getTuesday() != null) sb.append("Tuesday: " + getTuesday() + ",");
        if (getWednesday() != null) sb.append("Wednesday: " + getWednesday() + ",");
        if (getThursday() != null) sb.append("Thursday: " + getThursday() + ",");
        if (getFriday() != null) sb.append("Friday: " + getFriday() + ",");
        if (getSaturday() != null) sb.append("Saturday: " + getSaturday() + ",");
        if (getSunday() != null) sb.append("Sunday: " + getSunday() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMonday() == null) ? 0 : getMonday().hashCode()); 
        hashCode = prime * hashCode + ((getTuesday() == null) ? 0 : getTuesday().hashCode()); 
        hashCode = prime * hashCode + ((getWednesday() == null) ? 0 : getWednesday().hashCode()); 
        hashCode = prime * hashCode + ((getThursday() == null) ? 0 : getThursday().hashCode()); 
        hashCode = prime * hashCode + ((getFriday() == null) ? 0 : getFriday().hashCode()); 
        hashCode = prime * hashCode + ((getSaturday() == null) ? 0 : getSaturday().hashCode()); 
        hashCode = prime * hashCode + ((getSunday() == null) ? 0 : getSunday().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WeeklyAutoScalingSchedule == false) return false;
        WeeklyAutoScalingSchedule other = (WeeklyAutoScalingSchedule)obj;
        
        if (other.getMonday() == null ^ this.getMonday() == null) return false;
        if (other.getMonday() != null && other.getMonday().equals(this.getMonday()) == false) return false; 
        if (other.getTuesday() == null ^ this.getTuesday() == null) return false;
        if (other.getTuesday() != null && other.getTuesday().equals(this.getTuesday()) == false) return false; 
        if (other.getWednesday() == null ^ this.getWednesday() == null) return false;
        if (other.getWednesday() != null && other.getWednesday().equals(this.getWednesday()) == false) return false; 
        if (other.getThursday() == null ^ this.getThursday() == null) return false;
        if (other.getThursday() != null && other.getThursday().equals(this.getThursday()) == false) return false; 
        if (other.getFriday() == null ^ this.getFriday() == null) return false;
        if (other.getFriday() != null && other.getFriday().equals(this.getFriday()) == false) return false; 
        if (other.getSaturday() == null ^ this.getSaturday() == null) return false;
        if (other.getSaturday() != null && other.getSaturday().equals(this.getSaturday()) == false) return false; 
        if (other.getSunday() == null ^ this.getSunday() == null) return false;
        if (other.getSunday() != null && other.getSunday().equals(this.getSunday()) == false) return false; 
        return true;
    }
    
}
    