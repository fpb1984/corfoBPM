package cl.corfo.tramitessii;

public class Contribuyente implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Description(value = "RUT del Contribuyente")
   @org.kie.api.definition.type.Label(value = "RUT del Contribuyente")
   private java.lang.Long rut;
   @org.kie.api.definition.type.Description(value = "Digito Verificador del RUT")
   @org.kie.api.definition.type.Label(value = "Digito Verificador")
   private java.lang.String dv;
   @org.kie.api.definition.type.Description(value = "Token de Autenticacion")
   @org.kie.api.definition.type.Label(value = "Token de Autenticacion")
   private java.lang.String token;
   @org.kie.api.definition.type.Description(value = "Indicador de Autenticacion por SII")
   @org.kie.api.definition.type.Label(value = "Indicador de Autenticacion por SII")
   private java.lang.Boolean esAuthSII;
   @org.kie.api.definition.type.Description(value = "Indicador de Autenticacion por SRCeI")
   @org.kie.api.definition.type.Label(value = "Indicador de Autenticacion por SRCeI")
   private java.lang.Boolean esAuthSRCeI;

   public Contribuyente()
   {
   }

   public java.lang.Long getRut()
   {
      return this.rut;
   }

   public void setRut(java.lang.Long rut)
   {
      this.rut = rut;
   }

   public java.lang.String getDv()
   {
      return this.dv;
   }

   public void setDv(java.lang.String dv)
   {
      this.dv = dv;
   }

   public java.lang.String getToken()
   {
      return this.token;
   }

   public void setToken(java.lang.String token)
   {
      this.token = token;
   }

   public java.lang.Boolean getEsAuthSII()
   {
      return this.esAuthSII;
   }

   public void setEsAuthSII(java.lang.Boolean esAuthSII)
   {
      this.esAuthSII = esAuthSII;
   }

   public java.lang.Boolean getEsAuthSRCeI()
   {
      return this.esAuthSRCeI;
   }

   public void setEsAuthSRCeI(java.lang.Boolean esAuthSRCeI)
   {
      this.esAuthSRCeI = esAuthSRCeI;
   }

   public Contribuyente(java.lang.Long rut, java.lang.String dv,
         java.lang.String token, java.lang.Boolean esAuthSII,
         java.lang.Boolean esAuthSRCeI)
   {
      this.rut = rut;
      this.dv = dv;
      this.token = token;
      this.esAuthSII = esAuthSII;
      this.esAuthSRCeI = esAuthSRCeI;
   }

	@Override
	public String toString() {
		return "{\"rut\":" + this.rut + ", \"dv\":" + "\"" + this.dv + "\"" 
				+ ", \"token\":" + "\"" + this.token + "\"" 
				+ ", \"esAuthSII\":" + this.esAuthSII 
				+ ", \"esAuthSRCeI\":" + this.esAuthSRCeI + "}";
	}

}