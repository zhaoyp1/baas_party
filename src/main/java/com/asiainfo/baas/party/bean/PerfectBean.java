package com.asiainfo.baas.party.bean;


public class PerfectBean {
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Individual getIndividual() {
		return individual;
	}
	public void setIndividual(Individual individual) {
		this.individual = individual;
	}
	public PartyName getPartyName() {
		return partyName;
	}
	public void setPartyName(PartyName partyName) {
		this.partyName = partyName;
	}
	public PartyIdentification getPartyIdentification() {
		return partyIdentification;
	}
	public void setPartyIdentification(PartyIdentification partyIdentification) {
		this.partyIdentification = partyIdentification;
	}
	private Organization organization;
	private Individual individual;
	private PartyName partyName;
	private PartyIdentification partyIdentification;

}
