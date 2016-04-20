package com.gsta.bigdata.etl.core.source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.StringUtils;

import com.gsta.bigdata.etl.ETLException;
import com.gsta.bigdata.etl.core.ETLData;
import com.gsta.bigdata.etl.core.source.mro.ZTEMroObj;
import com.gsta.bigdata.etl.core.source.mro.ZTEMroObj_1;
import com.gsta.bigdata.utils.SourceXmlTool;

/**
 * source file,output line=three measurement
<?xml version="1.0" encoding="UTF-8"?>
<bulkPmMrDataFile>
<fileHeader fileFormatVersion="V1.0" reportTime="2016-03-13T07:00:00.000" startTime="2016-03-13T06:45:00.000" endTime="2016-03-13T07:00:00.000" period="15"/>
<eNB MR.eNBId="550984">
<measurement>
<smr>MR.LteScEarfcn MR.LteScPci MR.LteScRSRP MR.LteScRSRQ MR.LteScTadv MR.LteScPHR MR.LteScAOA MR.LteScSinrUL MR.LteScRI1 MR.LteScRI2 MR.LteScRI4 MR.LteScRI8 MR.LteScBSR MR.LteScPUSCHPRBNum MR.LteScPDSCHPRBNum MR.CQI0 MR.CQI1 MR.Longitude MR.Latitude MR.LteNcEarfcn MR.LteNcPci MR.LteNcRSRP MR.LteNcRSRQ MR.CDMAtype MR.CDMANcArfcn MR.CDMAPNphase MR.LteCDMAorHRPDNcPilotStrength MR.CDMANcBand MR.CDMANcPci</smr>
<object MR.MmeCode="1" MR.MmeGroupId="17409" MR.MmeUeS1apId="427874925" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2">
<v>100 117 20 21 0 19 NIL 24 0 0 0 0 1 34 80 6 NIL NIL NIL NIL NIL NIL NIL NIL NIL NIL NIL NIL NIL</v>
</object>
</measurement>
<measurement>
<smr>MR.LteScPlrULQci1 MR.LteScPlrULQci2 MR.LteScPlrULQci3 MR.LteScPlrULQci4 MR.LteScPlrULQci5 MR.LteScPlrULQci6 MR.LteScPlrULQci7 MR.LteScPlrULQci8 MR.LteScPlrULQci9 MR.LteScPlrDLQci1 MR.LteScPlrDLQci2 MR.LteScPlrDLQci3 MR.LteScPlrDLQci4 MR.LteScPlrDLQci5 MR.LteScPlrDLQci6 MR.LteScPlrDLQci7 MR.LteScPlrDLQci8 MR.LteScPlrDLQci9</smr>
<object MR.MmeCode="1" MR.MmeGroupId="17409" MR.MmeUeS1apId="427874925" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2">
<v>NIL NIL NIL NIL NIL NIL NIL NIL 0 NIL NIL NIL NIL NIL NIL NIL NIL 0</v>
</object>
</measurement>
<measurement>
<smr>MR.LteScRIP</smr>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:0">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:1">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:2">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:3">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:4">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:5">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:6">
<v>82</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:7">
<v>80</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:8">
<v>81</v>
</object>
<object MR.MmeCode="NIL" MR.MmeGroupId="NIL" MR.MmeUeS1apId="NIL" MR.TimeStamp="2016-03-13T06:45:35.360" MR.objectId="2:100:9">
<v>81</v>
</object>
</measurement>
</eNB>
</bulkPmMrDataFile>
 * @author tianxq
 *
 */
public class MroZte extends MroHuaWei {
	private static final long serialVersionUID = 1L;
	//the first and tow smr data,key=ZTEMroObj,value= objDatas index in list
	private Map<ZTEMroObj,Integer> firstSMRIdxs = new HashMap<ZTEMroObj,Integer>();
	//the third smr data,key =ZTEMroObj_1,value = objDatas index in list
	private Map<ZTEMroObj_1,Integer> thirdSMRIdxs = new HashMap<ZTEMroObj_1,Integer>();
	//etl data index
	private AtomicInteger etlDataIndex = new AtomicInteger(0);
	//save all object data of bulkPmMrDataFile
	private List<ETLData> objDatas = new ArrayList<ETLData>();
	private ZTEMroObj mroObj;
	private ZTEMroObj_1 mroObj_1;
	//key=object cig+timestamp,value=v of the same timestamp
	private Map<String,List<Long>> thirdObjDatas = new HashMap<String,List<Long>>();
	
	private String eNBId;
	private final static String ATTR_ENBID = "MR.eNBId";
	private final static String ATTR_MROBJ_ID = "MR.objectId";
	public final static String KEY_DELIMITER = "&";
	
	//1-smr include MR.LteScRSRP;2-include MR.LteScPlrULQci1;3-include MR.LteScRIP
	private int smrType = 0;
	
	public MroZte(){
		super();
	}
	
	public List<ETLData> parseLine(String line)
			throws ETLException, ValidatorException {
		if (line == null || "".equals(line)) {
			return null;
		}
		
		if(line.indexOf("<bulkPmMrDataFile>") != -1){
			super.startTime = null;
			super.endTime = null;
			this.smrType = 0;
			this.eNBId = null;
			this.thirdObjDatas.clear();
			this.firstSMRIdxs.clear();
			this.thirdSMRIdxs.clear();
			this.objDatas.clear();
			this.etlDataIndex = new AtomicInteger(0);
		}
		
		super.computeHeader(line);
		this.computeENBId(line);
		this.computeSmrsAndType(line);
		this.computeZTEObj(line);
		
		switch (this.smrType) {
		case 1:
			super.computeV(line);
			if(super.emitData(line,this.mroObj,this.smrType)){
				super.verifyKeyField();
				int idx = this.etlDataIndex.getAndIncrement();
				this.objDatas.add(idx, super.etlData);
				this.firstSMRIdxs.put(this.mroObj, idx);
				this.thirdSMRIdxs.put(this.mroObj_1, idx);
			}
			break;
		case 2:
			super.computeV(line);
			if(super.emitData(line,this.mroObj,this.smrType) &&
					this.firstSMRIdxs.containsKey(this.mroObj)){
				//merge one record
				Integer idx = this.firstSMRIdxs.get(this.mroObj);
				this.objDatas.get(idx.intValue()).addData(super.etlData);
			}
			break;
		case 3:
			//only one v line
			if(line.indexOf("<v>") != -1){
				String MRLteScRIP = SourceXmlTool.getTagValue(line, TAG_V);
				Long value;
				try{
					value = Long.parseLong(MRLteScRIP);
				}catch (NumberFormatException e) {
					value = 0L;
				}
				String timeStamp = this.mroObj.getTimeStamp();
				String key = this.mroObj.getCgi() + KEY_DELIMITER + timeStamp;
				if(this.thirdObjDatas.containsKey(key)){
					this.thirdObjDatas.get(key).add(value);
				}else{
					List<Long> values = new ArrayList<Long>();
					values.add(value);
					this.thirdObjDatas.put(key, values);
				}
			}
			//emit all third measurement data
			if(line.indexOf("</measurement>") != -1){
				for(Map.Entry<String, List<Long>> entry:this.thirdObjDatas.entrySet()){
					String key = entry.getKey();
					List<Long> values = entry.getValue();
					long sum = 0;
					for(Long v:values){
						sum += v.longValue();
					}
					long average = sum / values.size();
					ZTEMroObj_1 zteMroObj1 = new ZTEMroObj_1(key);
					if (this.thirdSMRIdxs.containsKey(zteMroObj1)) {
						Integer idx = this.thirdSMRIdxs.get(zteMroObj1);
						this.objDatas.get(idx.intValue()).addData(
								super.smrs.get(0), String.valueOf(average));
					}
				}//end for
			}
			break;
		}
		
		//emit all etldata
		if(line.indexOf("</bulkPmMrDataFile>") != -1){
			List<ETLData> ret = new ArrayList<ETLData>();
			for(ETLData etlData:this.objDatas){
				ret.add(etlData);
			}
			return ret;
		}
		
		return null;
	}
	
	private void computeENBId(String line){
		if (line == null || "".equals(line)) {
			return;
		}

		if (line.indexOf("<eNB") != -1) {
			this.eNBId = SourceXmlTool.getAttrValue(line, ATTR_ENBID);
		}
	}
	
	private void computeSmrsAndType(String line) {
		if (line == null || "".equals(line)) {
			return;
		}
		
		if (line.indexOf("<smr>") != -1) {
			super.smrs.clear();
			String smr = SourceXmlTool.getTagValue(line, TAG_SMR);
			if (StringUtils.isNotBlank(smr)) {
				String[] tempSmr = smr.replace(".", "_").split(" ");
				for (String temp : tempSmr) {
					super.smrs.add(temp);
				}
			}//end if
			
			if(smr.indexOf("MR.LteScRSRP") != -1){
				this.smrType = 1;
			}else if(smr.indexOf("MR.LteScPlrULQci1") != -1){
				this.smrType = 2;
			}else if(smr.indexOf("MR.LteScRIP") != -1){
				this.smrType = 3;
			}
		}
	}
	
	private void computeZTEObj(String line) {
		if (line == null || "".equals(line)) {
			return;
		}
		
		if (line.indexOf("<object") != -1) {
			super.etlData =  new ETLData();
			super.smrObjs.clear();
			this.mroObj = new ZTEMroObj();

			String timeStamp = SourceXmlTool.getAttrValue(line, ATTR_TIMESTAMP);
			if(timeStamp != null){
				timeStamp = timeStamp.replace("T", " ");
			}
			String id = SourceXmlTool.getAttrValue(line, ATTR_ID);
			String mmeGroupId = SourceXmlTool.getAttrValue(line,ATTR_MMEGROUPID);
			String mmeUeS1apId = SourceXmlTool.getAttrValue(line,ATTR_MMEUES1APID);
			String mmeCode = SourceXmlTool.getAttrValue(line, ATTR_MMECODE);
			String mrObjId = SourceXmlTool.getAttrValue(line, ATTR_MROBJ_ID);
			this.mroObj.setValues(id, mmeGroupId, mmeUeS1apId, mmeCode,timeStamp,eNBId,mrObjId);
			this.mroObj.computeNodeAndCellAndCgi();
			
			this.mroObj_1 = new ZTEMroObj_1(this.mroObj);
		}
	}
}
