import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class RegisterDaoImp implements RegisterDao {

	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	String status = "";
	@Transactional
	@Override
	public String insertUser(RegisterBean regBean) {
		// TODO Auto-generated method stub
		int sn = (Integer)hibernateTemplate.save(regBean);
		if(sn == regBean.getSerialNo())
		{
			status = "Successfully Inserted";
		}
		else
		{
			status = "404 Error while Inserting Data";
		}
		return status;
	}
	@Transactional
	@Override
	public RegisterBean searchBean(int SerialNo) 
	{
		// TODO Auto-generated method stub
		RegisterBean bean = hibernateTemplate.get(RegisterBean.class, SerialNo);
		if(bean == null)
		{
			return null;
		}
		else
		{
			return bean;
		}
		
	}
	@Transactional
	@Override
	public String update(RegisterBean regBean) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(regBean);//(return type is void...
		return "success";
	}
	@Transactional
	@Override
	public String deleteBean(int SerialNo) {
		// TODO Auto-generated method stub
		RegisterBean bean = new RegisterBean();
		bean.setSerialNo(SerialNo);
		hibernateTemplate.delete(bean); //(return type is void)
		return "Success";
	}

}
