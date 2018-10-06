public interface RegisterDao {
	public String insertUser(RegisterBean regBean);

	public RegisterBean searchBean(int SerialNo);

	public String update(RegisterBean regBean);

	public String deleteBean(int SerialNo);
}
